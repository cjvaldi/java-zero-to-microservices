package com.cjvaldi.springboot.datajpa.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.cjvaldi.springboot.datajpa.app.auth.handler.LoginSuccessHandler;

/**
 * @EnableMethodSecurity:
 * - securedEnabled = true: Habilita el uso de la anotación @Secured({"ROLE_ADMIN", "ROLE_USER"}) en controladores/servicios.
 * - prePostEnabled = true: Habilita el uso de @PreAuthorize("hasRole('ADMIN')") y @PostAuthorize.
 */
@EnableMethodSecurity(securedEnabled = true, prePostEnabled = true)
@Configuration
public class SpringSecurityConfig {

    private final LoginSuccessHandler successHandler;

    /**
     * Inyección por constructor del SuccessHandler.
     * 
     * NOTA: No es necesario inyectar ni declarar manualmente UserDetailsService ni DataSource aquí.
     * Al anotar 'JpaUserDetailsService' con @Service en su propia clase, Spring Security lo detecta 
     * y lo asocia automáticamente con el bean BCryptPasswordEncoder registrado en la aplicación.
     */
    public SpringSecurityConfig(LoginSuccessHandler successHandler) {
        this.successHandler = successHandler;
    }

    // =========================================================================
    // EVOLUCIÓN HISTÓRICA DE AUTENTICACIÓN (REFERENCIA PEDAGÓGICA):
    // =========================================================================
    
    /* 
     * ETAPA 1: Autenticación en Memoria (Pruebas iniciales sin BD)
     * 
     * @Bean
     * public UserDetailsService inMemoryUserDetailsManager(PasswordEncoder passwordEncoder) {
     *     UserDetails admin = User.builder()
     *             .username("admin")
     *             .password(passwordEncoder.encode("12345"))
     *             .roles("ADMIN", "USER")
     *             .build();
     *     return new InMemoryUserDetailsManager(admin);
     * }
     */

    /* 
     * ETAPA 2: Autenticación JDBC directa (Consultas SQL nativas sin entidades JPA)
     * 
     * @Bean
     * public UserDetailsService jdbcUserDetailsManager(DataSource dataSource) {
     *     JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
     *     manager.setUsersByUsernameQuery("SELECT username, password, enabled FROM users WHERE username = ?");
     *     manager.setAuthoritiesByUsernameQuery("SELECT u.username, a.authority FROM authorities a INNER JOIN users u ON a.user_id = u.id WHERE u.username = ?");
     *     return manager;
     * }
     */

    /* 
     * ETAPA 3 (ACTUAL): Autenticación mediante JPA / Hibernate
     * Se gestiona en 'JpaUserDetailsService.java' implementando 'UserDetailsService' 
     * y consultando las entidades 'Usuario' y 'Role' a través de 'IUsuarioDao'.
     */

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                // 1. Recursos estáticos y rutas de acceso libre sin autenticación
                .requestMatchers("/", "/css/**", "/js/**", "/images/**", "/listar", "/login").permitAll()

                /*
                 * 2. Autorización por URL (Descomentar si no se usan anotaciones en los Controllers):
                 * .requestMatchers("/ver/**", "/uploads/**").hasAnyRole("USER")
                 * .requestMatchers("/form/**", "/eliminar/**", "/factura/**").hasRole("ADMIN")
                 * 
                 * Al usar @EnableMethodSecurity, estas reglas se delegan directamente 
                 * a los métodos de los controladores mediante @Secured o @PreAuthorize.
                 */

                // 3. Cualquier otra petición exige inicio de sesión
                .anyRequest().authenticated()
            )
            .formLogin(form -> form
                .loginPage("/login")                  // Vista y controlador personalizado de login
                .successHandler(this.successHandler)  // Manejador para mensajes Flash e intercepciones post-login
                .permitAll()
            )
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")    // Parámetro procesado en LoginController para mostrar mensaje
                .permitAll()
            )
            .exceptionHandling(exception -> exception
                .accessDeniedPage("/error_403")       // Redirección ante código HTTP 403 (Acceso Denegado)
            );

        return http.build();
    }
}
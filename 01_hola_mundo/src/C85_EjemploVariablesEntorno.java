import java.util.Map;

public class C85_EjemploVariablesEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv =  System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("---Listando las variables de entorno del sistema ------");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir =  System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        //  otra manera de mostrar con   varEnv.get   y Path <> PATH , hay que colocar las variables tal cual
        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        // UNA VEZ CREADA HAY QUE REINICIAR EL INTELLIJ
        String appEnv =  varEnv.get("APPLICATION_ENV");  // VARIABLE DE ENTORNO CREADO EN W10
        System.out.println("appEnv = " + appEnv);

        // VARIABLE DE ENTORNO CREADO EN TERMINAL CON  setx SALUDAR_HOLA "Hola amigos que tal"
        // UNA VEZ CREADA HAY QUE REINICIAR EL INTELLIJ
        String hola = varEnv.get("SALUDAR_HOLA");
        System.out.println("hola = " + hola);

        
    }
}

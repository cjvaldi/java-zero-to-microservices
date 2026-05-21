import java.util.Properties;

public class C83_EjemploPropiedadesDelSistema {
    public static void main(String[] args) {

        String username =  System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace =  System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();
        System.out.println("lineSeparator = " + lineSeparator + " Una linea nueva...");

        // lista completa de propiedades por defecto
        Properties p = System.getProperties();
        p.list(System.out);

    }
}

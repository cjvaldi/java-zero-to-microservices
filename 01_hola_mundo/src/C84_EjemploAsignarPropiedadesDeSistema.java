import java.io.FileInputStream;
import java.util.Properties;

public class C84_EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/C84_config2.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);  //  para cargar las personalizaciones

            Properties ps = System.getProperties();
            System.out.println("ps.getProperties(...)= "+ ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

           ps.list(System.out);  // para listar
        } catch (Exception e){
            //System.out.println("No existe el archivo = " + e);
            System.err.println("El archivo no existe "+e.getMessage());
        }
    }
}

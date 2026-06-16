import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HelloWorldWindow {

    public static void main(String[] args) {
        createAndShowWindow();
    }

    public static void createAndShowWindow(){

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hola mundo swing!");
        JLabel text = new JLabel("Hola mund0!");

        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("cerrando ventana con éxito");
                System.exit(0);

            }
        });
        frame.getContentPane().add(text);
        frame.setVisible(true);
        frame.pack();
    }
}

import javax.swing.*;
import java.awt.*;

public class Windows11OptionDialog extends JFrame {
    Container container;

    public Windows11OptionDialog() {
        super("Ventana de dialogo con opciones");
        container = getContentPane();
        container.setLayout(new FlowLayout());
        Object[] options = {"Si OK", "No","Quizas mas tarde!"};

        int value = JOptionPane.showOptionDialog(
                null,
                "Desea continuar?",
                "Confirmar algina opción",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        System.out.println(value);
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new Windows11OptionDialog();
    }
}

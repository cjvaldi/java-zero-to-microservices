import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows08Calculator extends JFrame implements ActionListener {
    Container container;
    JTextField numberA, numberB, result;
    public static final String CALCULATOR_ADD = "Sumar";
    public static final String CALCULATOR_SUBSTRACTION = "Restar";
    public static final String CALCULATOR_MULTIPLICATION = "Multiplicar";
    public static final String CALCULATOR_DIVISION = "Dividir";
    public static final String CALCULATOR_CLOSE = "Salir";

    public Windows08Calculator() throws HeadlessException {
        super("Calculadora");
        container = getContentPane();
        container.setLayout(new BorderLayout());
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);

        JMenu menu = new JMenu("Operaciones");
        JMenuItem itemAdd = new JMenuItem(CALCULATOR_ADD);
        JMenuItem itemSubt = new JMenuItem(CALCULATOR_SUBSTRACTION);
        JMenuItem itemDiv = new JMenuItem(CALCULATOR_DIVISION);
        JMenuItem itemMult = new JMenuItem(CALCULATOR_MULTIPLICATION);
        menu.add(itemAdd);
        menu.add(itemSubt);
        menu.add(itemDiv);
        menu.add(itemMult);

        JMenu closeMenu = new JMenu("Cerrar");
        JMenuItem itemClose = new JMenuItem(CALCULATOR_CLOSE);
        closeMenu.add(itemClose);

        bar.add(menu);
        bar.add(closeMenu);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Número 1"));
        panel.add(numberA = new JTextField(3));
        panel.add(new JLabel("Número 2"));
        panel.add(numberB = new JTextField(3));
        panel.add(new JLabel("Resultado"));
        panel.add(result = new JTextField(5));
        result.setEditable(false);

        itemAdd.addActionListener(this);
        itemSubt.addActionListener(this);
        itemMult.addActionListener(this);
        itemDiv.addActionListener(this);
        itemClose.addActionListener(this);

        container.add(panel, BorderLayout.CENTER);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new Windows08Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String operation = e.getActionCommand();
        int a = Integer.parseInt(numberA.getText().trim());
        int b = Integer.parseInt(numberB.getText().trim());
        int value = 0;
        switch (operation) {
            case CALCULATOR_ADD:
                value = a + b;
                break;
            case CALCULATOR_SUBSTRACTION:
                value = a - b;
                break;
            case CALCULATOR_MULTIPLICATION:
                value = a * b;
                break;
            case CALCULATOR_DIVISION:
                if (b == 0) {
                    JOptionPane.showMessageDialog(null,
                            "No se puede dividir en cero, infinito!",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE);
                    break;
                    //throw new ArithmeticException("No se puede dividir en cero, infinito");
                }
                value = a / b;
                break;
            case CALCULATOR_CLOSE:
                System.exit(0);
        }
        result.setText(String.valueOf(value));
    }
}

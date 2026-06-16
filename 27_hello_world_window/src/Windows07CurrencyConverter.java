import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows07CurrencyConverter extends JFrame implements ActionListener {

    Container panel;
    JButton buttonEu, buttonUsd,buttonReset;
    JTextField mount;

    public static final String CURRENCY_DOLAR = "Dolar";
    public static final String CURRENCY_EUROS = "Euros";

    public Windows07CurrencyConverter() throws  HeadlessException{
        super("Conversor de Monedas");
        panel = getContentPane();
        panel.setLayout(new FlowLayout());

        mount = new JTextField(10);
        buttonReset =  new JButton("Reset");
        buttonReset.addActionListener(this);
        buttonEu = new JButton(CURRENCY_EUROS);
        buttonEu.addActionListener(this);
        buttonUsd = new JButton(CURRENCY_DOLAR);
        buttonUsd.addActionListener(this);
        panel.add(mount);
        panel.add(buttonEu);
        panel.add(buttonUsd);
        panel.add(buttonReset);
        setSize(500, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        float value = Float.parseFloat(mount.getText());
        String textCurrency = e.getActionCommand();
        if(textCurrency.equals(CURRENCY_EUROS)){
            value = (float) (value/1029.19);
            panel.setBackground(Color.green);
        } else if(textCurrency.equals(CURRENCY_DOLAR)){
            value = (float) (value/970.00);
            panel.setBackground(Color.blue);
        }else{
            value=0.00F;
        }
        mount.setText(String.valueOf(value));
    }

    public static void main(String[] args) {
        new Windows07CurrencyConverter();
    }
}

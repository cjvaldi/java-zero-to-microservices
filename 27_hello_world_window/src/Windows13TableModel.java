import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class Windows13TableModel extends JFrame {

    public Windows13TableModel(){
        super("Tabla con registros o Grilla");

        JTable table = new JTable(new UserTableMode());

        JScrollPane scroll = new JScrollPane(table);

        JPanel panel = new JPanel();
        panel.add(scroll);

        getContentPane().add(panel);
        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Windows13TableModel();
    }

    private class UserTableMode extends AbstractTableModel {
        private String[] columns ={"Id","Name","Lastname","Email"};
        private Object[][] rows;
        public UserTableMode(){
            this.rows = new Object[5][4];
            rows[0] = new Object[]{1,"Cristian","Jacson","correo@correo.com"};
            rows[1] = new Object[]{2,"Pepe","Torres","pepe@correo.com"};
            rows[2] = new Object[]{3,"Juan","Sanchez","juan@correo.com"};
            rows[3] = new Object[]{4,"Carlos","Perez","carlos@correo.com"};
            rows[4] = new Object[]{5,"Sebas","Tunbres","sebas@correo.com"};
        }
        @Override
        public int getRowCount() {
            return rows.length;
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return rows[rowIndex][columnIndex];
        }

        @Override
        public String getColumnName(int column) {
            return columns[column];
        }
    }
}

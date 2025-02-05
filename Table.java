
import javax.swing.JOptionPane;

public class Table {

    public static int[][] CreateTable() {
        String num1 = JOptionPane.showInputDialog("Enter row: ");
        int rw = Integer.parseInt(num1);
        String num2 = JOptionPane.showInputDialog("Enter column: ");
        int col = Integer.parseInt(num2);

        return new int[rw][col];
    }
}

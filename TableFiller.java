
import javax.swing.JOptionPane;

public class TableFiller {

    public static void FillTable(int[][] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                String num = JOptionPane.showInputDialog("Enter element: ");
                elements[i][j] = Integer.parseInt(num);
            }
        }
    }
}

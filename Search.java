
import javax.swing.JOptionPane;

public class Search {

    public static void searchElement(int[][] elements) {
        String num3 = JOptionPane.showInputDialog("Enter element to search: ");
        int search = Integer.parseInt(num3);

        boolean found = false;
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                if (elements[i][j] == search) {
                    System.out.println("Element is in row [" + (i + 1) + "] column [" + (j + 1) + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }
}

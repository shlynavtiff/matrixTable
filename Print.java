
public class Print {

    public static void printTable(int[][] elements) {
        System.out.println("The elements are:");
        for (int[] row : elements) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

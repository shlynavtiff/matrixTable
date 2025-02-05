
public class TableList {

    public static void printEvenNumbers(int[][] elements) {
        System.out.println("Even numbers from the list of elements:");
        for (int[] row : elements) {
            for (int num : row) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
    }

    public static void printOddNumbers(int[][] elements) {
        System.out.println("Odd numbers fromt the list of elements:");
        for (int[] row : elements) {
            for (int num : row) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
        System.out.println();
    }
}

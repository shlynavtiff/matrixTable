
public class TableSum {

    public static int sumEvenNumbers(int[][] elements) {
        int sumEven = 0;
        for (int[] row : elements) {
            for (int num : row) {
                if (num % 2 == 0) {
                    sumEven += num;
                }
            }
        }
        return sumEven;
    }

    public static int sumOddNumbers(int[][] elements) {
        int sumOdd = 0;
        for (int[] row : elements) {
            for (int num : row) {
                if (num % 2 != 0) {
                    sumOdd += num;
                }
            }
        }
        return sumOdd;
    }
}

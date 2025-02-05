
public class Main {

    public static void main(String[] args) {

        int[][] elements = Table.CreateTable();

        TableFiller.FillTable(elements);
        Print.printTable(elements);

        Search.searchElement(elements);

        TableList.printEvenNumbers(elements);
        TableList.printOddNumbers(elements);

        System.out.println("Sum of all even numbers: " + TableSum.sumEvenNumbers(elements));
        System.out.println("Sum of all odd numbers: " + TableSum.sumOddNumbers(elements));
    }
}

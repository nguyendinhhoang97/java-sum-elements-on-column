import java.util.Scanner;

public class CalculateSumOnColumn {
    public static void main(String[] args) {
        int[][] array;
        int row;
        int column;
        int columnCaculate;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of row: ");
        row = scanner.nextInt();
        System.out.println("Enter numbers of column: ");
        column = scanner.nextInt();
        array = new int[row][column];
        System.out.println("Input elements of array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Your array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] < 10)
                    System.out.print("0" + array[i][j]+" ");
                else
                    System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        while (1<2) {
            System.out.println("Enter the column to calculate the sum: ");
            columnCaculate = scanner.nextInt();
            for (int i = 0; i < row; i++) {
                sum += array[i][columnCaculate - 1];
            }
            System.out.println("Sum of column " + (columnCaculate) + " : " + sum);
            sum=0;
        }
    }
}

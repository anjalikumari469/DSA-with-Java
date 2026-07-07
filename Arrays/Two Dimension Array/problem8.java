
// //find the sum of each row.
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = obj.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = obj.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = obj.nextInt();
            }
        }

        // Print Matrix
        System.out.println("Matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of each row
        for (int i = 0; i < rows; i++) {
            int sum = 0;

            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

    }
}
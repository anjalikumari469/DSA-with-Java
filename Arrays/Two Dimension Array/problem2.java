
// Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of rows:");
        int rows = obj.nextInt();
        System.out.println("Enter size of columns:");
        int cols = obj.nextInt();

        int[][] num = new int[rows][cols];

        // input
        // rows
        System.out.println("Enter elements of  the array:");
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                num[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter the Element of X:");
        int x = obj.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (num[i][j] == x) {
                    System.out.println("X Found at index is (" + i + " , " + j + ")");

                }
            }
        }
    }
}

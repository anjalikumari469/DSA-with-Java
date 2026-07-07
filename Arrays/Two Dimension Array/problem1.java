
//
import java.util.Scanner;

public class problem1 {
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
            for (int j = 0; j < cols; j++) {
                num[i][j] = obj.nextInt();
            }
        }

        // output
        // columns
        System.out.println("Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}

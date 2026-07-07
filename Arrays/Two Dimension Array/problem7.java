
//Find the smallest element in the matrix.
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = obj.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = obj.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = obj.nextInt();

            }
        }

        System.out.println("Matrix becomes:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int min = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Smallest number is :" + min);
    }
}

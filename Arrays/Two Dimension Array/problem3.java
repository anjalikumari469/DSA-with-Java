
// For a given matri of N X M, Print its transpose.
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the size of rows:");
        n = obj.nextInt();
        System.out.println("Enter the size of columns:");
        m = obj.nextInt();
        int matrix[][] = new int[n][m];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }

        System.out.println("Matrix becomes:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The transpose of matrix is:");
        // To print transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Find the sum of matrix.

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        int n, m;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of rows:");
        n = obj.nextInt();

        System.out.println("Enter the size of  columns:");
        m = obj.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] sum = new int[n][m];

        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("First Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = obj.nextInt();
            }
        }
        System.out.println("Second Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of Matrix is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

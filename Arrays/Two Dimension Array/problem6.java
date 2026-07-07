//Find the largest element in the matrix.
// public class problem6 {
//     public static void main(String[] args) {

//         int[][] arr = {
//             {1, 2, 3, 4},
//             {8, 6, 5, 7},
//             {2, 4, 7, 8}
//         };

//         int max = arr[0][0];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] > max) {
//                     max = arr[i][j];
//                 }
//             }
//         }

//         System.out.println("Largest element is: " + max);
//     }
// }

// taking input through user.
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix becomes:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest element is: " + max);

        sc.close();
    }
}
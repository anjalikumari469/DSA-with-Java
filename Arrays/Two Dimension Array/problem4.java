//
public class problem4 {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 9, 8, 7, 6, 4 },
                { 0, 5, 4, 6, 7 }
        };

        System.out.println("Array becomes:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

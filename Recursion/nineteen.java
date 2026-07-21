
// Place tiles of size 1xm in a floor of size nxm
import java.util.Scanner;

public class nineteen {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        // vertically
        int vertPlacements = placeTiles(n - m, m);
        // horizontally
        int horPlacements = placeTiles(n - 1, m);
        return vertPlacements + horPlacements;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n = obj.nextInt();
        System.out.println("Enter the columns:");
        int m = obj.nextInt();
        System.out.println("Number of ways:" + placeTiles(n, m));
    }
}

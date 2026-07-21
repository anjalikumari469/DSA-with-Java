
// Count total paths in a maze to move from(0,0)to(n,m)
import java.util.Scanner;

public class eighteen {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards
        int dowmPaths = countPaths(i + 1, j, n, m);
        // move right
        int rightPaths = countPaths(i, j + 1, n, m);
        // total paths
        return dowmPaths + rightPaths;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        n = obj.nextInt();
        System.out.println("Enter the no of columns: ");
        m = obj.nextInt();
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Total Paths=" + totalPaths);
    }
}

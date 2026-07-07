
// wap to print sum of n natural number.
import java.util.Scanner;

public class natural {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Natural no:");
        n = obj.nextInt();
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is:" + sum);
    }
}

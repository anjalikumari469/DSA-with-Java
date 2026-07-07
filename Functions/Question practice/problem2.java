
// write a function to print the sum of all odd number from 1 to n
import java.util.Scanner;

public class problem2 {
    public static void printsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum is:"+sum);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = obj.nextInt();
        printsum(n);
    }
}

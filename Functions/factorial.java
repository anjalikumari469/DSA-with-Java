
// find the factorial of a number
import java.util.Scanner;

public class factorial {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();
        printFactorial(n);
    }
}

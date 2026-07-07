
// write a function which takes in 2 numbers and return the greater of those two
import java.util.Scanner;

public class problem3 {
    public static int getGreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = obj.nextInt();
        System.out.println("Enter the second number:");
        int b = obj.nextInt();
        System.out.println("Greatest number is:"+getGreater(a, b));
    }
}


// Enter three no from the user and make a function to print their average
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int a, b, c, avg;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = obj.nextInt();
        System.out.println("Enter the second number:");
        b = obj.nextInt();
        System.out.println("Enter the third number:");
        c = obj.nextInt();
        avg = (a + b + c) / 3;
        System.out.println("Average is:" + avg);
    }
}

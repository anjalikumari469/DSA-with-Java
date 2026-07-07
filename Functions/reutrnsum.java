// make a function to add 2 number and return the sum
import java.util.*;

public class reutrnsum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a, b, sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the first no:");
        a = obj.nextInt();
        System.out.println("enter the second number:");
        b = obj.nextInt();
        sum = calculateSum(a, b);
        System.out.println("sum is:"+sum);

    }
}
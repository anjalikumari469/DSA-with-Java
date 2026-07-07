
//make a function to multiply 2 numbers and return the product
import java.util.Scanner;

public class returnproduct {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a, b, product;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = obj.nextInt();
        System.out.println("Enter the second number:");
        b = obj.nextInt();
        product = calculateProduct(a, b);
        System.out.println("Product is:" + product);
    }
}

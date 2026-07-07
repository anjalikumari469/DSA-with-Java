import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first no:");
        int a = obj.nextInt();
        System.out.println("Enter the second no:");
        int b = obj.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is greater:");
        } else {
            System.out.println("B is lesser:");
        }
    }
}

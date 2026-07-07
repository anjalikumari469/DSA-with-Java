import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        int a, b, choice;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = obj.nextInt();
        System.out.println("Enter the second number:");
        b = obj.nextInt();
        System.out.println("Enter the Choice");
        choice = obj.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition is :" + (a + b));
                break;
            case 2:
                System.out.println("Subtraction is:" + (a - b));
                break;
            case 3:
                System.out.println("Multiplication is:" + (a * b));
                break;
            case 4:
                System.out.println("Division is:" + (a / b));
                break;
            case 5:
                System.out.println("Modulous is :" + (a % b));
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}

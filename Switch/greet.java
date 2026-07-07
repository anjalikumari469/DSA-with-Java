import java.util.Scanner;

public class greet {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Button:");
        int button = obj.nextInt();
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjur");
                break;

            default:
                System.out.println("Invalid Button");
                break;
        }

    }
}

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the  button:");
        int button = obj.nextInt();
        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjur");
        } else {
            System.out.println("Invalid Button");
        }

    }
}


// Print a name taking input through user.
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        // string declaration
        // String name = "Anjali";
        // String fullName = "Anjali Kumari";
        // String sentences = "My Name is Anjali Kumari";

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = obj.nextLine();
        System.out.println("My name is:" + name);
    }
}

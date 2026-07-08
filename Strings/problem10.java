// Check palindrome
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = obj.next();

        String reverse = "";

        // Reverse String
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // Compare Original and Reverse
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
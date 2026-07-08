
// Reverse of Strings.
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = obj.next();
        System.out.println("Reverse of string is:");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}

// Print all the Subsequences of a string.
import java.util.Scanner;

public class fourteen {
    public static void subsequences(String str, int indx, String newString) {
        if (indx == str.length()) {
            System.out.println("Subsequences of strings are:" + newString);
            return;
        }
        char currChar = str.charAt(indx);
        // to be
        subsequences(str, indx + 1, newString + currChar);
        // or not to be
        subsequences(str, indx + 1, newString);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the strings:");
        String str = obj.nextLine();
        subsequences(str, 0, " ");
    }
}


// Remove duplicates in a string.
import java.util.Scanner;

public class thirteen {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int indx, String newString) {
        if (indx == str.length()) {
            System.out.println("Duplicate strings are:" + newString);
            return;
        }
        char currChar = str.charAt(indx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, indx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, indx + 1, newString);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Strings:");
        String str = obj.nextLine();
        removeDuplicates(str, 0, " ");
    }
}

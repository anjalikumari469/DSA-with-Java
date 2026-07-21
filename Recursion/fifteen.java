
// Print all the unique subsequences of a string. 'aaa'  "Hashset"
import java.util.HashSet;
import java.util.Scanner;

public class fifteen {
    public static void subsequences(String str, int indx, String newString, HashSet<String> set) {
        if (indx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {

                System.out.println("Subsequences of strings are:" + newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(indx);
        // to be
        subsequences(str, indx + 1, newString + currChar, set);
        // or not to be
        subsequences(str, indx + 1, newString, set);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = obj.nextLine();
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, " ", set);
    }
}

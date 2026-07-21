
// Print all permutations of a string.
import java.util.Scanner;

public class seventeen {
    public static void printPermu(String str, int indx, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermu(newStr, indx + 1, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = obj.nextLine();
        printPermu(str, 0, " ");
    }
}

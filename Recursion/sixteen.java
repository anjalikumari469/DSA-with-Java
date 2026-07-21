
// print keypad combination
import java.util.Scanner;

public class sixteen {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombination(String str, int indx, String combination) {
        if (indx == str.length()) {
            System.out.println("Keypad combination is:" + combination);
            return;
        }
        char currChar = str.charAt(indx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, indx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = obj.nextLine();
        printCombination(str, 0, " ");
    }
}

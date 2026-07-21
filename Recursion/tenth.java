
// Find the first and last occurence of an element in string.
import java.util.Scanner;

public class tenth {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int indx, char element) {
        if (indx == str.length()) {
            System.out.println("First Occurance:" + first);
            System.out.println("Last Occurance:" + last);
            return;
        }
        char currChar = str.charAt(indx);
        if (currChar == element) {
            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
        }
        findOccurance(str, indx + 1, element);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = obj.nextLine();
        System.out.println("Enter Character:");
        char element = obj.next().charAt(0);
        findOccurance(str, 0, element);
    }
}

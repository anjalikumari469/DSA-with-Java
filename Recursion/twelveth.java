
// Move all 'X' to the end of the string.(axbcxxd)
import java.util.Scanner;

public class twelveth {
    public static void moveAllX(String str, int indx, int count, String newString) {
        if (indx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println("Output String:" + newString);
            return;
        }
        char currChar = str.charAt(indx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, indx + 1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, indx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = obj.nextLine();
        moveAllX(str, 0, 0, "");

    }
}

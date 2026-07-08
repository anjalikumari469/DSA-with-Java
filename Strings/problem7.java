
//Input a String from the user.create a new string called 'result'in which you will replace the letter 'e' in the original string with letter 'i'.
import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = obj.next();
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result += 'i';

            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("New String:" + result);
    }
}

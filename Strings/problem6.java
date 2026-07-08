
// Take an array of string input from the user and find the combined length of all those strings.
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int size = obj.nextInt();
        String array[] = new String[size];
        int totalLength = 0;
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            array[i] = obj.next();
            totalLength += array[i].length();

        }
        System.out.println("combined length:" + totalLength);
    }
}

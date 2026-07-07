
// Take an array as input from user. search for a given number x and print the index at which it occurs.
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = obj.nextInt();
        int num[] = new int[size];

        // input
        System.out.println("Element of the array is:");
        for (int i = 0; i < size; i++) {
            num[i] = obj.nextInt();
        }
        System.out.println("element is:");
        int x = obj.nextInt();
        // output
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println(" X Found at index: " + i);
            }
        }
    }
}

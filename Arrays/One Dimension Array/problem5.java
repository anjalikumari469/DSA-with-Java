
// Take an array of names as input from the user and print them on the screen.
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of element:");
        int size = obj.nextInt();
        String name[] = new String[size];
        // input
        System.out.println("Enter the name:");
        for (int i = 0; i < size; i++) {
            name[i] = obj.next();
        }
        // output
        System.out.println("Name is:");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name " + (i + 1) + " is: " + name[i]);
        }
    }
}

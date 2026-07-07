
// Take input through user and find array.
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array :");
        int size = obj.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("Element of array is:");
        for (int i = 0; i < size; i++) {
            numbers[i] = obj.nextInt();
        }
        // output
        System.out.println("Array is:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}


// Find the maximum and minimum number in an array of integer.
import java.util.Scanner;

public class probelm6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = obj.nextInt();
        int numbers[] = new int[size];

        // input
        System.out.println("Enter the element of array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = obj.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is:" + max);
        System.out.println("Smallest number is:" + min);
    }
}

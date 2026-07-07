
// Taking an array as an input and printing its element.
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = obj.nextInt();
        int num[] = new int[size];
        System.out.println("Element is:");
        for (int i = 0; i < size; i++) {
            num[i] = obj.nextInt();
        }
        System.out.println("Array is:");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }
}

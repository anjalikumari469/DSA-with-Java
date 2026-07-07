//Search f0r a specific no in array and print its position.

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter number to search:");
        int target = obj.nextInt();
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Number found at position:" + position);
        } else {
            System.out.println("Number not found:");
        }
    }
}

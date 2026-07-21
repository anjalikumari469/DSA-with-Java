
// Check if an array is sorted(strictly increasing)
import java.util.Scanner;

public class eleventh {
    public static boolean sorted(int arr[], int indx) {
        if (indx == arr.length - 1) {
            return true;
        }
        if (arr[indx] < arr[indx + 1]) {
            // array is sorted till now
            return sorted(arr, indx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        boolean ans = sorted(arr, 0);
        if (ans) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}

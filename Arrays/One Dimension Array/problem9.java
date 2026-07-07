// Find smallest element in an array.
public class problem9 {
    public static void main(String[] args) {
        int[] arr = { 65, 35, 37, 20, 12, 90, 54 };
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Element is:" + smallest);
    }
}

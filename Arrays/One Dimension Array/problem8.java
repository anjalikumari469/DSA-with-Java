//Find the largest element in an array.

public class problem8 {
    public static void main(String[] args) {
        int[] arr = { 21, 56, 32, 43, 57, 93, 23, 87 };
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is:" + largest);
    }
}

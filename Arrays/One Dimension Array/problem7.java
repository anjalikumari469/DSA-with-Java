// Take 5 numbers in an array and print their sum.

public class problem7 {
    public static void main(String[] args) {
        int[] arr = { 5, 12, 4, 1, 3 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum is:" + sum);
    }
}

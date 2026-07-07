// Find the average of all elements in an array.
public class problem10 {
    public static void main(String[] args) {
        int[] arr = { 10, 40, 20, 25 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average is:" + average);
    }
}

// print sum of first n natural number.

// public class third {
//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum+=i;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }


// taking input through user.
import java.util.Scanner;

 public class third {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println("Sum of series is:" + sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = obj.nextInt();
        printSum(1, n, 0);
    }

}
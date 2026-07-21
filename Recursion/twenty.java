
//  find the number of ways in which you can invite n people to your party, single or in pairs.
import java.util.Scanner;

public class twenty {
    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = callGuests(n - 1);
        // pair
        int ways2 = (n - 1) * callGuests(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Number of Guests:");
        int n = obj.nextInt();
        System.out.println("Number of ways:" + callGuests(n));
    }
}


// write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age>18 is eligible to vote.
import java.util.Scanner;

public class problem6 {
    public static boolean isElligible(int age) {
        if (age > 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = obj.nextInt();
        System.out.println("Age is:" + isElligible(age));
    }
}

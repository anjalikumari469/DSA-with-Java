
//Input an email from the user. you have to create a username from he email by deleting the part that comes after '@'. Display that username to the user.
import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your Email:");
        String email = obj.next();
        String username = " ";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                username += email.charAt(i);
            }
        }
        System.out.println("Username:" + username);
    }
}

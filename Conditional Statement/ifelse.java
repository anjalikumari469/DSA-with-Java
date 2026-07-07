import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int a, b, c;
        char greatest;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first no:");
        a = obj.nextInt();
        System.out.println("Enter the second no:");
        b = obj.nextInt();
        System.out.println("Enter the third no:");
        c = obj.nextInt();
        if ((a > b) && (a > c)) {
            greatest = 'a';
        } else if ((b > c) && (b > a)) {
            greatest = 'b';
        } else {
            greatest = 'c';
        }
        System.out.println("Greatest no is" + greatest);

    }
}

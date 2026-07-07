
//write a function that takes in the radius as input and returns the circumferences of a circle
import java.util.Scanner;

public class problem4 {
    public static double getCircumference(double radius) {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number:");
        double r = obj.nextDouble();
        System.out.println("Circumference of circle is:" + getCircumference(r));
    }
}

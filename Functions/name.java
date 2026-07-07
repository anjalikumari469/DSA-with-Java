import java.util.Scanner;

public class name {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = obj.next();
        printMyName("Name is:"+name);
    }
}

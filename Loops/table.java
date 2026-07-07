// print the table of a number input by the user.
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        int i ,n ;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = obj.nextInt();
        for(i=1;i<11;i++){
            System.out.println("Table  is"+(i*n)); 
        }
    }
}

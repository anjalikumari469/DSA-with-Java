import java.util.Scanner;

class Student {
    int m1, m2;

    void getdata(int x, int y) {
        m1 = x;
        m2 = y;
    }

    void disp() {

    }
}

interface sports {
    int sp = 10;

    void spmarks();
}

class result extends Student implements sports {
    void disp() {
        System.out.println("First marks is " + m1);
        System.out.println("Second marks is " + m2);
    }

    public void spmarks() {
        System.out.println("Sports marks is:" + sp);
    }

    void totalmarks() {
        int total;
        total = m1 + m2;
        System.out.println("Total marks is:" + total);
    }
}

public class problem5 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the first no:");
        int num1 = obj.nextInt();
        System.out.println("Enter the second no:");
        int num2 = obj.nextInt();
        result t = new result();
        t.getdata(num1, num2);
        t.disp();
        t.spmarks();
        t.totalmarks();
    }
}

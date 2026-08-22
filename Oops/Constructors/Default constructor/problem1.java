class Test {
    int a, b;

    Test() {
        a = 10;
        b = 20;
    }

    void display() {
        System.out.println("value of a is " + a);
        System.out.println("value of b is " + b);
    }
}

public class problem1 {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}

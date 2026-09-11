class A {
    int x, y;

    void getdata(int a, int b) {
        x = a;
        y = b;
    }

    void add() {
        System.out.println("Addition is:" + (x + y));
    }
}

class B extends A {
    void mult() {
        System.out.println("Mult is:" + (x * y));
    }
}

public class singlelevel1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.getdata(10, 20);
        obj.add();
        obj.mult();
    }
}

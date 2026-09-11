class test {
    int a, b;

    void calc(int x) {
        a = x;
        System.out.println("Square is:" + (a * a));
    }

    void calc(int x, int y) {
        a = x;
        b = y;
        System.out.println("Addition is:" + (a + b));
    }
}

public class  methodoverloading1 {
    public static void main(String[] args) {
        test obj = new test();
        obj.calc(10);
        obj.calc(10, 20);
    }
}

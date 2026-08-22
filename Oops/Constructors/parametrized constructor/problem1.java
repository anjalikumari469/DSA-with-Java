class test {
    int A, P, l, b;

    test(int x, int y) {
        l = x;
        b = y;
    }

    void area() {
        A = l * b;
        System.out.println("Area is " + A);
    }

    void perimeter() {
        P = 2 * (l + b);
        System.out.println("Perimeter is " + P);
    }
}

public class problem1 {
    public static void main(String[] args) {
        test obj = new test(10, 20);
        obj.area();
        obj.perimeter();
    }
}

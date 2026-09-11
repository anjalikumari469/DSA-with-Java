class shape {
    public void area() {
        System.out.println("Display Area:");
    }
}

class Triangle extends shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class singlelevel {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area(10,5);
    }
}

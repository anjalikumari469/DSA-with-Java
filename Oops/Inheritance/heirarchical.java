class one {
    int x = 10;
    int y = 20;

    void Display() {
        System.out.println("value of x is:" + x);
        System.out.println("value of y is:" + y);
    }
}

class two extends one {
    void add() {
        System.out.println("Add is" + (x + y));
    }
}

class three extends one {
    void sub() {
        System.out.println("Sub is:" + (x - y));

    }
}

class four extends one {
    void mult() {
        System.out.println("Mult is:" + (x * y));
    }
}

public class heirarchical {
    public static void main(String[] args) {
        four obj = new four();
        obj.Display();
        two obj1 = new two();
        three obj2 = new three();
        four obj3 = new four();
        obj1.Display();
        obj1.add();
        obj2.sub();
        obj3.mult();
    }
}

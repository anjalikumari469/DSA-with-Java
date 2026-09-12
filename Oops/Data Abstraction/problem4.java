interface A {
    int roll = 101;

    void dispa();
}

interface B {
    void dispb();
}

class c implements A, B {  // multiple inheritance
    public void dispa() {
        System.out.println("Roll no  is:" + roll);
    }

    public void dispb() {
        System.out.println("Method of B interface:");
    }
}

public class problem4 {
    public static void main(String[] args) {
        c obj = new c();
        obj.dispa();
        obj.dispb();
    }

}

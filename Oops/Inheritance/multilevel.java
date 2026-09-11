class Student {
    int roll;

    void getroll(int x) {
        roll = x;
    }

    void printroll() {
        System.out.println("Roll no is:" + roll);
    }
}

class test extends Student {
    int m1, m2;

    void getmarks(int x, int y) {
        m1 = x;
        m2 = y;
    }

    void printmarks() {
        System.out.println("Marks of first sub:" + m1);
        System.out.println("Marks of second sub:" + m2);
    }
}

class Result extends test {
    int total;

    void Display() {
        total = m1 + m2;
        System.out.println("Total marks:" + total);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Result obj = new Result();
        obj.getroll(26);
        obj.getmarks(90, 89);
        obj.printroll();
        obj.printmarks();
        obj.Display();
    }
}

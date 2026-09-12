interface Animal {
    void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Walks on 4 legs:");
    }
}

public class problem3 {
    public static void main(String[] args) {
        Horse obj = new Horse();
        obj.walk();
    }

}

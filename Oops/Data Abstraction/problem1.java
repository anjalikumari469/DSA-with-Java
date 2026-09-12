abstract class Animal {
    abstract void walk();

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on four legs");
    }
}

class cow extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class problem1 {
    public static void main(String[] args) {
        Horse obj = new Horse();
        obj.walk();
    }
}

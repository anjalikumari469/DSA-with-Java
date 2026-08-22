class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class problem2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anjali";
        s1.age = 20;

        s1.printInfo();
    }
}

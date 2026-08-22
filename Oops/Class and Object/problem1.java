class pen {
    String colour;
    String type; // ballpoint,gel

    public void write() {
        System.out.println("Writing something");
    }

    public void printColour() {
        System.out.println(this.colour);
    }
}

public class problem1 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.colour = "black";
        pen2.type = "ballpoint";
        pen1.printColour();
        pen2.printColour();
    }
}

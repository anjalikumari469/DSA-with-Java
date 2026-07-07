public class solidrhombus {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            // spaces
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

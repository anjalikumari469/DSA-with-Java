public class diamondpattern {
    public static void main(String[] args) {
        int i, j;
        // upper half
        for (i = 1; i <= 4; i++) {
            // spaces
            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (i = 4; i >= 1; i--) {
            // spaces
            for (j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

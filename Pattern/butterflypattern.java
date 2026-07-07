public class butterflypattern {
    public static void main(String[] args) {
        int i, j;
        // upper half
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (5 - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (i = 5; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (5 - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

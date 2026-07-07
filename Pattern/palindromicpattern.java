public class palindromicpattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            // spaces
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 1st half number
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // 2nd half number
            for (j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

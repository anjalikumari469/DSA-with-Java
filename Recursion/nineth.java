// print a string in reverse
// time complexity 0(n)
public class nineth {
    public static void printRev(String str, int indx) {
        if (indx == 0) {
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printRev(str, indx - 1);
    }

    public static void main(String[] args) {
        String str = "abcde";
        printRev(str, str.length() - 1);
    }
}

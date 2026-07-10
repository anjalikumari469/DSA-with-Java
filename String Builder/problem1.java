
public class problem1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert a character
        sb.insert(0, 's');
        System.out.println(sb);

        // delete the extra 's'
        sb.delete(0, 1);
        System.out.println(sb);

        
    }
}

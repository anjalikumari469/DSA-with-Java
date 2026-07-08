
public class problem2 {
    public static void main(String[] args) {

        // concatenation
        String firstName = "Anjali";
        String lastName = "Kumari";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // Anjali Kumari
        System.out.println(fullName.length());

        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}

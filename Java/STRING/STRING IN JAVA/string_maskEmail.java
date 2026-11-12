// Author: Amit Gupta
// Date: 09-09-2026
// Program: Mask email address

public class string_maskEmail {
    public static void main(String[] args) {
        //  Declare email
        String email = "amitgupta@example.com";

        //  Split into parts
        String[] parts = email.split("@");

        //  Mask first part
        String masked = parts[0].charAt(0) + "*****" + parts[0].charAt(parts[0].length()-1);

        // Print result
        System.out.println("Masked email => " + masked + "@" + parts[1]);
    }
}

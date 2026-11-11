// Author: Amit Gupta
// Date: 09-09-2026
// Program: Hide password with stars

public class string_hidePassword {
    public static void main(String[] args) {
        //  Declare password
        String password = "mypassword";

        // Replace all characters with '*'
        String hidden = "*".repeat(password.length());

        // Print result
        System.out.println("Hidden password => " + hidden);
    }
}

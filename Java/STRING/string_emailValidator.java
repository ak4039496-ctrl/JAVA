// Author: Amit Gupta
// Date: 29-08-2026
// Program: Basic email validation

public class string_emailValidator {
    public static void main(String[] args) {
        //  Declare email
        String email = "test@example.com";

        // Check if contains '@' and '.'
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}

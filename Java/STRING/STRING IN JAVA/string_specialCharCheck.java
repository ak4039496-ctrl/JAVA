// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check if string contains special characters

public class string_specialCharCheck {
    public static void main(String[] args) {
        // Declare string
        String text = "Hello@123";

        //Loop through characters
        boolean hasSpecial = false;
        for (char c : text.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
                break;
            }
        }

        //  Print result
        System.out.println("Contains special character? " + hasSpecial);
    }
}

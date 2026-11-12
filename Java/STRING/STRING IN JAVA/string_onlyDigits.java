// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check if string contains only digits

public class string_onlyDigits {
    public static void main(String[] args) {
        //  Declare string
        String text = "12345";

        // Use matches() with regex
        boolean result = text.matches("[0-9]+");

        // Print result
        System.out.println("Only digits? " + result);
    }
}

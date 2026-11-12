// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check if string contains only letters

public class string_onlyLetters {
    public static void main(String[] args) {
        // Declare string
        String text = "HelloWorld";

        // Use matches() with regex
        boolean result = text.matches("[a-zA-Z]+");

        //  Print result
        System.out.println("Only letters? " + result);
    }
}

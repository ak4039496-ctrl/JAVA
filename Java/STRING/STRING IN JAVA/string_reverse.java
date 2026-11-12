// Author: Amit Gupta
// Date: 09-09-2026
// Program: Reverse a string

public class string_reverse {
    public static void main(String[] args) {
        //  Declare a string
        String text = "Hello";

        // Reverse using loop
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        // Print result
        System.out.println("Reversed => " + rev);
    }
}

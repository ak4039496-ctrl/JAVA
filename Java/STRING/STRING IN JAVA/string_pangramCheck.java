// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check if string is pangram (contains all letters)

public class string_pangramCheck {
    public static void main(String[] args) {
        // Declare string
        String text = "The quick brown fox jumps over the lazy dog";

        // Convert to lowercase
        text = text.toLowerCase();

        // Check all letters a-z
        boolean pangram = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (text.indexOf(c) == -1) {
                pangram = false;
                break;
            }
        }

        // Print result
        System.out.println("Is pangram? " + pangram);
    }
}

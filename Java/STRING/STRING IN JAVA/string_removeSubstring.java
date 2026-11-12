// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove substring from string

public class string_removeSubstring {
    public static void main(String[] args) {
        // Declare string
        String text = "I love Java programming";

        // Remove "Java"
        String result = text.replace("Java ", "");

        // Print result
        System.out.println("Result => " + result);
    }
}

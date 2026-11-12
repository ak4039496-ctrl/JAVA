// Author: Amit Gupta
// Date: 09-09-2026
// Program: Convert string to Title Case

public class string_titleCase {
    public static void main(String[] args) {
        // Declare sentence
        String text = "hello world java";

        // Split into words
        String[] words = text.split(" ");

        // Capitalize first letter of each word
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        //  Print result
        System.out.println("Title Case = " + result.trim());
    }
}

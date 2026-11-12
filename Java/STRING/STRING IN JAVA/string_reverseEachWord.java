// Author: Amit Gupta
// Date: 09-09-2026
// Program: Reverse each word in sentence

public class string_reverseEachWord {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Hello World";

        // Split into words
        String[] words = text.split(" ");

        // Reverse each word
        String result = "";
        for (String w : words) {
            result += new StringBuilder(w).reverse().toString() + " ";
        }

        // Print result
        System.out.println("Reversed words = " + result);
    }
}

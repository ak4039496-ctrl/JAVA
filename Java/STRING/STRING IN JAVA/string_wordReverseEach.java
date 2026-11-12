// Author: Amit Gupta
// Date: 09-09-2026
// Program: Reverse each word individually

public class string_wordReverseEach {
    public static void main(String[] args) {
        //Declare sentence
        String text = "Java is fun";

        // Split into words
        String[] words = text.split(" ");

        // Reverse each word
        String result = "";
        for (String w : words) {
            result += new StringBuilder(w).reverse().toString() + " ";
        }

        // Print result
        System.out.println("Reversed each word = " + result.trim());
    }
}

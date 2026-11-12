// Author: Amit Gupta
// Date: 09-09-2026
// Program: Reverse words in sentence

public class string_reverseWords {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Hello World Java";

        // Split into words
        String[] words = text.split(" ");

        //Reverse order
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        // Print result
        System.out.println("Reversed words => " + result.trim());
    }
}

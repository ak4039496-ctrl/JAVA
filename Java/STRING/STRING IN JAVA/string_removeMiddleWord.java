// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove middle word

public class string_removeMiddleWord {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Java is powerful";

        // Split into words
        String[] words = text.split(" ");

        //Remove middle word
        String result = words[0] + " " + words[words.length-1];

        // Print result
        System.out.println("Result => " + result);
    }
}

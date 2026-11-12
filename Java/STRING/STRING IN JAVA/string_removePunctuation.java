// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove punctuation from string

public class string_removePunctuation {
    public static void main(String[] args) {
        // Declare string
        String text = "Hello, World! Java.";

        //Replace punctuation with empty string
        String result = text.replaceAll("\\p{Punct}", "");

        // Print result
        System.out.println("Without punctuation => " + result);
    }
}

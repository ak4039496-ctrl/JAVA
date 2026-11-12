// Author: Amit Gupta
// Date: 09-09-2026
// Program: Split string by spaces

public class string_split {
    public static void main(String[] args) {
        // Declare a string
        String text = "Hello World Java";

        // Split by space
        String[] words = text.split(" ");

        // Print each word
        for (String w : words) {
            System.out.println(w);
        }
    }
}

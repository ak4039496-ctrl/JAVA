// Author: Amit Gupta
// Date: 09-09-2026
// Program: Count vowels in string

public class string_countVowels {
    public static void main(String[] args) {
        // Declare a string
        String text = "Hello World";

        // Initialize counter
        int count = 0;

        // Loop through characters
        for (char c : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }

        // Print result
        System.out.println("Vowels => " + count);
    }
}

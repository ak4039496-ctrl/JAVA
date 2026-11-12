// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove vowels from string

public class string_removeVowels {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello World";

        // Replace vowels with empty string
        String result = text.replaceAll("[AEIOUaeiou]", "");

        //  Print result
        System.out.println("Without vowels => " + result);
    }
}

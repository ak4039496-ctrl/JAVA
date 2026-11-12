// Author: Amit Gupta
// Date: 09-09-2026
// Program: Print each character of string

public class string_printChars {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello";

        // Loop through characters
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}

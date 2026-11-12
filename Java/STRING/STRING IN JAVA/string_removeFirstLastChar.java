// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove first and last character

public class string_removeFirstLastChar {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello";

        // Remove first and last char
        String result = text.substring(1, text.length()-1);

        // Print result
        System.out.println("Result => " + result);
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check if string is palindrome

public class string_palindrome {
    public static void main(String[] args) {
        //  Declare a string
        String text = "madam";

        //  Reverse string
        String rev = new StringBuilder(text).reverse().toString();

        //  Compare original and reversed
        if (text.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

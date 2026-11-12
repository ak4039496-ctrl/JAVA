// Author: Amit Gupta
// Date: 09-09-2026
// Program: Convert string to character array

public class string_toCharArray {
    public static void main(String[] args) {
        // Declare a string
        String text = "Hello";

        //Convert to char array
        char[] arr = text.toCharArray();

        //  Print each character
        for (char c : arr) {
            System.out.println(c);
        }
    }
}

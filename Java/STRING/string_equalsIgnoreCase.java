// Author: Amit Gupta
// Date: 09-09-2026
// Program: Compare strings ignoring case

public class string_equalsIgnoreCase {
    public static void main(String[] args) {
        // Step 1: Declare two strings
        String s1 = "Hello";
        String s2 = "hello";

        // Step 2: Compare ignoring case
        boolean result = s1.equalsIgnoreCase(s2);

        // Step 3: Print result
        System.out.println("Are equal (ignore case)? " + result);
    }
}

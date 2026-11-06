// Author: Amit Gupta
// Date: 09-10-2026
// Program: Compare strings ignoring case using compareToIgnoreCase()

public class string_compareIgnoreCase {
    public static void main(String[] args) {
        //  Declare strings
        String s1 = "Hello";
        String s2 = "hello";

        // Compare ignoring case
        int result = s1.compareToIgnoreCase(s2);

        //Print result
        System.out.println("Comparison result = " + result);
    }
}

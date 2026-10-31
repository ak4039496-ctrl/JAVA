// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reverse a string using do-while loop

public class reverse_string {
    public static void main(String[] args) {
        String str = "JAVA"; // Input string
        int i = str.length() - 1; // Start from last index
        String rev = ""; //  Initialize reverse string
        do {
            rev += str.charAt(i); //  Append character
            i--; //  Move backward
        } while (i >= 0); // Condition check
        System.out.println("Reversed = " + rev); //  Print result
    }
}

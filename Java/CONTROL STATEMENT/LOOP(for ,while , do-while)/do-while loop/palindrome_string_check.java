// Author: Amit Gupta
// Date: 16-09-2026
// Program: Check if a string is palindrome

public class palindrome_string_check {
    public static void main(String[] args) {
        String str = "MADAM"; //  Input string
        int i = 0; // Start index
        int j = str.length() - 1; // End index
        boolean palindrome = true; // Assume true
        do {
            if (str.charAt(i) != str.charAt(j)) { // Compare
                palindrome = false; //  Not palindrome
                break;
            }
            i++; j--; // Move inward
        } while (i < j); // Condition check
        if (palindrome) System.out.println(str + " is Palindrome");
        else System.out.println(str + " is Not Palindrome");
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reverse a string and check if it is palindrome 

public class reverse_string_palindrome_check {
    public static void main(String[] args) {
        String str = "MADAM"; // string to check
        int i = str.length() - 1; // start from last index
        String rev = ""; // store reverse

        while (i >= 0) {
            rev += str.charAt(i); // add character to reverse
            i--;
        }

        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}

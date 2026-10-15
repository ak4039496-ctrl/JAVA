/*
Author: Amit Gupta
Date: 25-09-2026
Program: Check if a string is palindrome
*/

public class Palindrome_check {
    public static void main(String[] args) {
        String str = "level";
        boolean isPalindrome = true;

        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}

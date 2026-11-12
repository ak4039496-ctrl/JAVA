// Author: Amit Gupta
// Date: 09-09-2026
// Program: Find longest palindrome word

public class string_longestPalindromeWord {
    public static void main(String[] args) {
        // Declare sentence
        String text = "madam racecar level hello";

        // Split into words
        String[] words = text.split(" ");

        //  Find longest palindrome
        String longest = "";
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (w.equals(rev) && w.length() > longest.length()) {
                longest = w;
            }
        }

        // Print result
        System.out.println("Longest palindrome word => " + longest);
    }
}

// Author: Amit Gupta
// Date: 19-09-2026
// Program: Check if two strings are anagrams

import java.util.Arrays;

public class string_anagramCheck {
    public static void main(String[] args) {
        // Step 1: Declare two strings
        String s1 = "listen";
        String s2 = "silent";

        // Step 2: Convert to char arrays
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        // Step 3: Sort arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare arrays
        boolean result = Arrays.equals(arr1, arr2);

        // Step 5: Print result
        System.out.println("Are anagrams? " + result);
    }
}

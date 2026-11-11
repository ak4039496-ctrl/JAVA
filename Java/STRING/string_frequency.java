// Author: Amit Gupta
// Date: 09-09-2026
// Program: Find frequency of characters

public class string_frequency {
    public static void main(String[] args) {
        //  Declare a string
        String text = "banana";

        // Loop through characters
        int[] freq = new int[256];
        for (char c : text.toCharArray()) {
            freq[c]++;
        }

        //  Print frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " => " + freq[i]);
            }
        }
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Sort words alphabetically

import java.util.Arrays;

public class string_sortWords {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Java is powerful and simple";

        // Split into words
        String[] words = text.split(" ");

        //  Sort words
        Arrays.sort(words);

        // Print result
        for (String w : words) {
            System.out.println(w);
        }
    }
}

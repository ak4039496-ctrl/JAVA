// Author: Amit Gupta
// Date: 19-10-2026
// Program: Find duplicate words

import java.util.HashSet;

public class string_duplicateWords {
    public static void main(String[] args) {
        //  Declare sentence
        String text = "Java is powerful powerful powerful";

        // Split into words
        String[] words = text.split(" ");

        // Use HashSet to find duplicates
        HashSet<String> set = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        for (String w : words) {
            if (!set.add(w)) {
                duplicates.add(w);
            }
        }

        // Print duplicates
        System.out.println("Duplicate words = " + duplicates);
    }
}

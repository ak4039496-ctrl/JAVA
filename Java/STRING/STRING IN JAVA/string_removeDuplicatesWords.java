// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove duplicate words

import java.util.Arrays;
import java.util.LinkedHashSet;

public class string_removeDuplicatesWords {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Java is powerful powerful powerful";

        // Split into words
        String[] words = text.split(" ");

        // Use LinkedHashSet to remove duplicates
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(words));

        // Print result
        System.out.println("Without duplicates => " + String.join(" ", set));
    }
}

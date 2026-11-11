// Author: Amit Gupta
// Date: 09-09-2026
// Program: Find largest word in string

public class string_largestWord {
    public static void main(String[] args) {
        //  Declare a string
        String text = "Java is powerful language";

        //  Split into words
        String[] words = text.split(" ");

        // Find largest word
        String largest = "";
        for (String w : words) {
            if (w.length() > largest.length()) {
                largest = w;
            }
        }

        // Print result
        System.out.println("Largest word => " + largest);
    }
}

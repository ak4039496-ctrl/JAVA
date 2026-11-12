// Author: Amit Gupta
// Date: 09-09-2026
// Program: Find smallest word in string

public class string_smallestWord {
    public static void main(String[] args) {
        //  Declare a string
        String text = "Java is powerful language";

        // Split into words
        String[] words = text.split(" ");

        //  Find smallest word
        String smallest = words[0];
        for (String w : words) {
            if (w.length() < smallest.length()) {
                smallest = w;
            }
        }

        //  Print result
        System.out.println("Smallest word => " + smallest);
    }
}

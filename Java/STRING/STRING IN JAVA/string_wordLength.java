// Author: Amit Gupta
// Date: 09-09-2026
// Program: Print length of each word

public class string_wordLength {
    public static void main(String[] args) {
        //Declare sentence
        String text = "Java is powerful";

        // Split into words
        String[] words = text.split(" ");

        // Print each word length
        for (String w : words) {
            System.out.println(w + " = " + w.length());
        }
    }
}

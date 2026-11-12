// Author: Amit Gupta
// Date: 09-09-2026
// Program: Print words in reverse order pattern

public class string_wordReversePattern {
    public static void main(String[] args) {
        //  Declare sentence
        String text = "Java is fun";

        //Split into words
        String[] words = text.split(" ");

        //Print reverse pattern
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]);
        }
    }
}

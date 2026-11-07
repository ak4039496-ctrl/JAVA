// Author: Amit Gupta
// Date: 09-09-2026
// Program: Count words in sentence

public class string_countWords {
    public static void main(String[] args) {
        //  Declare sentence
        String text = "Java is a powerful language";

        // Split by space
        String[] words = text.split(" ");

        //  Print count
        System.out.println("Word count => " + words.length);
    }
}

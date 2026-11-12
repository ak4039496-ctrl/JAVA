// Author: Amit Gupta
// Date: 09-09-2026
// Program: Count words in string

public class string_wordCount {
    public static void main(String[] args) {
        //  Declare a string
        String text = "Hello World Java";

        //  Split by space
        String[] words = text.split(" ");

        //  Print word count
        System.out.println("Word count => " + words.length);
    }
}

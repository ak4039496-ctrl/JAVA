// Author: Amit Gupta
// Date: 09-09-2026
// Program: Swap first and last words

public class string_swapWords {
    public static void main(String[] args) {
        //  Declare sentence
        String text = "Java is powerful";

        //Split into words
        String[] words = text.split(" ");

        // Swap first and last
        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;

        // Print result
        System.out.print(String.join(" ", words));
    }
}

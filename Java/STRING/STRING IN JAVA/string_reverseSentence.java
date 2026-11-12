// Author: Amit Gupta
// Date: 09-09-2026
// Program: Reverse entire sentence

public class string_reverseSentence {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Java is fun";

        //  Reverse using StringBuilder
        String result = new StringBuilder(text).reverse().toString();

        //Print result
        System.out.println("Reversed sentence => " + result);
    }
}

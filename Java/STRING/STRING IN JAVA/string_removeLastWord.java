// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove last word from sentence

public class string_removeLastWord {
    public static void main(String[] args) {
        //  Declare sentence
        String text = "Java is powerful";

        //  Find last space
        int lastSpace = text.lastIndexOf(" ");

        //Remove last word
        System.out.println("Result => " + text.substring(0, lastSpace));
    }
}

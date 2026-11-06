// Author: Amit Gupta
// Date: 09-10-2026
// Program: Capitalize first letter of each word

public class string_capitalizeWords {
    public static void main(String[] args) {
        // Declare sentence
        String text = "java is powerful";

        // Split into words
        String[] words = text.split(" ");

        //  Capitalize each word
        String result = "";
        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        //  Print result
        System.out.println("Capitalized => " + result);
    }
}

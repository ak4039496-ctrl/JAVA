// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove first word from sentence

public class string_removeFirstWord {
    public static void main(String[] args) {
        // Declare sentence
        String text = "Java is powerful";

        //  Split into words
        String[] words = text.split(" ", 2);

        // Step 3: Remove first word
        System.out.println("Result = " + words[1]);
    }
}

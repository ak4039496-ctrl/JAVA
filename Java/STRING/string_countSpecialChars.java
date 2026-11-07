// Author: Amit Gupta
// Date: 09-10-2026
// Program: Count special characters

public class string_countSpecialChars {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello@123#World";

        // Initialize counter
        int count = 0;

        //  Loop through characters
        for (char c : text.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                count++;
            }
        }

        //Print result
        System.out.println("Special characters count => " + count);
    }
}

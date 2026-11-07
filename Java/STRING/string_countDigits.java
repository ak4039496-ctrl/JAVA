// Author: Amit Gupta
// Date: 09-09-2026
// Program: Count digits in string

public class string_countDigits {
    public static void main(String[] args) {
        //  Declare string
        String text = "Java123";

        // Initialize counter
        int count = 0;

        // Loop through characters
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        // Print result
        System.out.println("Digits count => " + count);
    }
}

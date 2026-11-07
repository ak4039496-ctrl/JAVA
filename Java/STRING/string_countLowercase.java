// Author: Amit Gupta
// Date: 09-09-2026
// Program: Count lowercase letters

public class string_countLowercase {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello World JAVA";

        // Initialize counter
        int count = 0;

        // Loop through characters
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }

        // Print result
        System.out.println("Lowercase count => " + count);
    }
}

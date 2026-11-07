// Author: Amit Gupta
// Date: 09-10-2026
// Program: Count uppercase letters

public class string_countUppercase {
    public static void main(String[] args) {
        // Declare string
        String text = "Hello World JAVA";

        // Initialize counter
        int count = 0;

        //  Loop through characters
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        //  Print result
        System.out.println("Uppercase count => " + count);
    }
}

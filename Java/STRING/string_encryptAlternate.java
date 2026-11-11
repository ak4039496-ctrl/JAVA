// Author: Amit Gupta
// Date: 09-09-2026
// Program: Encrypt by shifting alternate characters

public class string_encryptAlternate {
    public static void main(String[] args) {
        // Step 1: Declare string
        String text = "hello";

        // Step 2: Encrypt alternate characters
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0) {
                result += (char)(text.charAt(i) + 1);
            } else {
                result += text.charAt(i);
            }
        }

        // Step 3: Print result
        System.out.println("Encrypted = " + result);
    }
}

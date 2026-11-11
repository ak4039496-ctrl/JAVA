// Author: Amit Gupta
// Date: 09-09-2026
// Program: Simple encryption (shift ASCII)

public class string_encryptSimple {
    public static void main(String[] args) {
        // Declare string
        String text = "hello";

        // Encrypt by adding 1 to ASCII
        String result = "";
        for (char c : text.toCharArray()) {
            result += (char)(c + 1);
        }

        // Step 3: Print result
        System.out.println("Encrypted => " + result);
    }
}

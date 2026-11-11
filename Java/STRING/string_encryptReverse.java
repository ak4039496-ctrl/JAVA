// Author: Amit Gupta
// Date: 09-09-2026
// Program: Encrypt by reversing string

public class string_encryptReverse {
    public static void main(String[] args) {
        // Declare string
        String text = "secret";

        // Reverse string
        String result = new StringBuilder(text).reverse().toString();

        //  Print result
        System.out.println("Encrypted => " + result);
    }
}

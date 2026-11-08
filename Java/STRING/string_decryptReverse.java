// Author: Amit Gupta
// Date: 19-09-2026
// Program: Decrypt by reversing string back

public class string_decryptReverse {
    public static void main(String[] args) {
        // Declare encrypted string
        String text = "terces";

        //Reverse again to decrypt
        String result = new StringBuilder(text).reverse().toString();

        // Print result
        System.out.println("Decrypted => " + result);
    }
}

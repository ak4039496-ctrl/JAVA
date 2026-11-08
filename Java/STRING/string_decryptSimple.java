// Author: Amit Gupta
// Date: 09-09-2026
// Program: Simple decryption (reverse shift)

public class string_decryptSimple {
    public static void main(String[] args) {
        //  Declare encrypted string
        String text = "ifmmp";

        // Decrypt by subtracting 1 from ASCII
        String result = "";
        for (char c : text.toCharArray()) {
            result += (char)(c - 1);
        }

        // Print result
        System.out.println("Decrypted => " + result);
    }
}

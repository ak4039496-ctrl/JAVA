// Author: Amit Gupta
// Date: 09-09-2026
// Program: Caesar cipher encryption

public class string_caesarCipher {
    public static void main(String[] args) {
        //  Declare string
        String text = "HELLO";

        //  Shift value
        int shift = 3;

        //  Encrypt by shifting characters
        String result = "";
        for (char c : text.toCharArray()) {
            result += (char)((c - 'A' + shift) % 26 + 'A');
        }

        //  Print result
        System.out.println("Encrypted => " + result);
    }
}

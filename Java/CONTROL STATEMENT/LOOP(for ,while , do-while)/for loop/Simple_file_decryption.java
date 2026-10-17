/*
Author: Amit Gupta
Date: 05-09-2026
Program: Simple File Decryption (string-based)
*/

public class Simple_file_decryption {
    public static void main(String[] args) {
        String encrypted = "KHOOR#ZRUOG"; // shifted by 3
        String decrypted = "";

        for(char c : encrypted.toCharArray()) {
            decrypted += (char)(c - 3);
        }

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}

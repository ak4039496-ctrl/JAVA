/*
Author: Amit Gupta
Date: 05-09-2026
Program: Simple File Encryption (string-based)
*/

public class Simple_file_encryption {
    public static void main(String[] args) {
        String data = "HELLO WORLD";
        String encrypted = "";

        for(char c : data.toCharArray()) { // For-each loop
            encrypted += (char)(c + 3); // shift by 3
        }

        System.out.println("Original: " + data);
        System.out.println("Encrypted: " + encrypted);
    }
}

// Author: Amit Gupta
// Date: 20-09-2026
// Program: Check vowel or consonant 

public class vowel_consonant {
    public static void main(String[] args) {
        
        char ch = 'e'; // Example character
        
        switch(ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel"); break;
            default:
                System.out.println("Consonant");
        }
    }
}

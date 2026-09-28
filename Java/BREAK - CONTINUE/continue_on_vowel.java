// Author: Amit Gupta
// Date: 09-09-2026
// Program: Skip vowels in character array

public class continue_on_vowel {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', 'c', 'e', 'f'};
        
        // loop through letters
        for (int i = 0; i < letters.length; i++) {
            
            // skip vowels
            if (letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
                continue;
            }
            
            // print consonant
            System.out.println(letters[i]);
        }
    }
}

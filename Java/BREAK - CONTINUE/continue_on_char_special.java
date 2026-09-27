// Author: Amit Gupta
// Date: 09-09-2026
// Program: Skip special characters

public class continue_on_char_special {
    public static void main(String[] args) {
        
        char[] letters = {'a', '#', 'b', '$', 'c'};
        
        for (int i = 0; i < letters.length; i++) {
            if (!Character.isLetterOrDigit(letters[i])) {
                continue; // skip special characters
            }
            System.out.println(letters[i]);
        }
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Skip digits

public class continue_on_char_digit_found {
    public static void main(String[] args) {
        
        char[] letters = {'1', 'a', '2', 'b', '3'};
        
        for (int i = 0; i < letters.length; i++) {
            if (Character.isDigit(letters[i])) {
                continue; // skip digits
            }
            System.out.println(letters[i]);
        }
    }
}

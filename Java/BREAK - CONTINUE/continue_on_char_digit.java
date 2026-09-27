// Author: Amit Gupta
// Date: 20-09-2026
// Program: Skip digit characters

public class continue_on_char_digit {
    public static void main(String[] args) {
        
        char[] letters = {'a', '1', 'b', '2', 'c'};
        
        for (int i = 0; i < letters.length; i++) {
            if (Character.isDigit(letters[i])) {
                continue; // skip digits
            }
            System.out.println(letters[i]);
        }
    }
}

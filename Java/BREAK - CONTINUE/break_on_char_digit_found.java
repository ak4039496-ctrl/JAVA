// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when digit is found

public class break_on_char_digit_found {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', '3', 'c'};
        
        for (int i = 0; i < letters.length; i++) {
            if (Character.isDigit(letters[i])) {
                break; // stop loop
            }
            System.out.println(letters[i]);
        }
    }
}

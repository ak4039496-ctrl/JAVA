// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip lowercase characters

public class continue_on_char_lowercase {
    public static void main(String[] args) {
        
        char[] letters = {'A', 'b', 'C', 'd'};
        
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLowerCase(letters[i])) {
                continue; // skip lowercase
            }
            System.out.println(letters[i]);
        }
    }
}

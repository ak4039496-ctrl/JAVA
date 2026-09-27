// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip character 'y'

public class continue_on_char_found_y {
    public static void main(String[] args) {
        
        char[] letters = {'x', 'y', 'z', 'a'};
        
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'y') {
                continue; // skip 'y'
            }
            System.out.println(letters[i]);
        }
    }
}

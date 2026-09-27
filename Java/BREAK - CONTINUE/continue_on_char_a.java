// Author: Amit Gupta
// Date: 20-09-2026
// Program: Skip character 'a'

public class continue_on_char_a {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'a') {
                continue; // skip 'a'
            }
            System.out.println(letters[i]);
        }
    }
}

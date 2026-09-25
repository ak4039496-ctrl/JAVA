// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when character 'x' is found

public class break_on_char_found_x {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', 'x', 'c'};
        
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'x') {
                break;
            }
            System.out.println(letters[i]);
        }
    }
}

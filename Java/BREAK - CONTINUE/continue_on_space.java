// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip space characters

public class continue_on_space {
    public static void main(String[] args) {
        
        char[] letters = {'J', 'a', 'v', 'a', ' ', 'C', 'o', 'd', 'e'};
        
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') {
                continue; // skip space
            }
            System.out.print(letters[i]);
        }
    }
}

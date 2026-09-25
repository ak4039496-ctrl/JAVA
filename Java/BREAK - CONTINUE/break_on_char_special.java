// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when special character is found

public class break_on_char_special {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', 'c','#',};
        
        for (int i = 0; i < letters.length; i++) {
            if (!Character.isLetterOrDigit(letters[i])) {
                break; 
            }
            System.out.println(letters[i]);
        }
    }
}

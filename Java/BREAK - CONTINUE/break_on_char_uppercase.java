// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when uppercase character is found

public class break_on_char_uppercase {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', 'C', 'd'};
        
        for (int i = 0; i < letters.length; i++) {
            if (Character.isUpperCase(letters[i])) {
                break; 
            }
            System.out.println(letters[i]);
        }
    }
}

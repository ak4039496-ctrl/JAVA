// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when character 'z' is found

public class break_on_char_z {
    public static void main(String[] args) {
        
        char[] letters = {'a', 'b', 'c', 'z', 'd'};
        
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'z') {
                break; 
            }
            System.out.println(letters[i]);
        }
    }
}

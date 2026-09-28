// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip uppercase letters

public class continue_on_uppercase {
    public static void main(String[] args) {
        
        char[] letters = {'A', 'b', 'C', 'd', 'E'};
        
        for (int i = 0; i < letters.length; i++) {
            if (Character.isUpperCase(letters[i])) {
                continue; // skip uppercase
            }
            System.out.println(letters[i]);
        }
    }
}

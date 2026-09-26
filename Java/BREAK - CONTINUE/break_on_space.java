// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when space character is found

public class break_on_space {
    public static void main(String[] args) {
        
        char[] letters = {'J', 'a', 'v', 'a', ' ', 'C', 'o', 'd', 'e'};
        
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') {
                break; // stop loop
            }
            System.out.print(letters[i]);
        }
    }
}

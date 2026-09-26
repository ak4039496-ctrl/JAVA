// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when word ends with 'e'

public class break_on_word_end_e {
    public static void main(String[] args) {
        
        String[] words = {"java", "code", "apple", "loop"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("e")) {
                break; // stop loop
            }
            System.out.println(words[i]);
        }
    }
}

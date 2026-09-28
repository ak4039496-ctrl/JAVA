// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip words ending with 'a'

public class continue_on_word_end_a {
    public static void main(String[] args) {
        
        String[] words = {"java", "india", "code", "loop"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("a")) {
                continue; // skip words ending with a
            }
            System.out.println(words[i]);
        }
    }
}

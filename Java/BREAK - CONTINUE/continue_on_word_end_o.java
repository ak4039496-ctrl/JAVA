// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip words ending with 'o'

public class continue_on_word_end_o {
    public static void main(String[] args) {
        
        String[] words = {"hello", "java", "demo", "loop"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("o")) {
                continue; // skip words ending with o
            }
            System.out.println(words[i]);
        }
    }
}

// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip words ending with 'g'

public class continue_on_word_end_g {
    public static void main(String[] args) {
        
        String[] words = {"coding", "java", "loop", "debug"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("g")) {
                continue; // skip words ending with g
            }
            System.out.println(words[i]);
        }
    }
}

// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip words shorter than 4 letters

public class continue_on_short_word {
    public static void main(String[] args) {
        
        String[] words = {"hi", "java", "sun", "code", "loop"};
        
        // loop through words
        for (int i = 0; i < words.length; i++) {
            
            // skip short words
            if (words[i].length() < 4) {
                continue;
            }
            
            // print word
            System.out.println(words[i]);
        }
    }
}

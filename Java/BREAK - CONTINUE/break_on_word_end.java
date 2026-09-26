// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when word ends with 'ing'

public class break_on_word_end {
    public static void main(String[] args) {
        
        String[] words = {"play", "run", "coding", "java"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("ing")) {
                break; // stop loop
            }
            System.out.println(words[i]);
        }
    }
}

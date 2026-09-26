// Author: Amit Gupta
// Date:    19-09-2026
// Program: Stop loop when word ends with 'n'

public class break_on_word_end_n {
    public static void main(String[] args) {
        
        String[] words = {"run", "fun", "java", "loop"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith("n")) {
                break; // stop loop
            }
            System.out.println(words[i]);
        }
    }
}

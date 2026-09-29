// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip word "jump"

public class continue_on_word_jump {
    public static void main(String[] args) {
        
        String[] words = {"run", "jump", "play", "code"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("jump")) {
                continue; // skip "jump"
            }
            System.out.println(words[i]);
        }
    }
}

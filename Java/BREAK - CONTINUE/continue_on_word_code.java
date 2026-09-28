// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip word "code"

public class continue_on_word_code {
    public static void main(String[] args) {
        
        String[] words = {"java", "code", "break", "continue"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("code")) {
                continue; // skip "code"
            }
            System.out.println(words[i]);
        }
    }
}

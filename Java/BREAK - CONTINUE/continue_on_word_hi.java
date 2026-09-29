// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip word "Hi"

public class continue_on_word_hi {
    public static void main(String[] args) {
        
        String[] words = {"Hi", "Java", "Code", "Loop"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Hi")) {
                continue; // skip "Hi"
            }
            System.out.println(words[i]);
        }
    }
}

// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when word "exit" is found

public class break_on_word_exit_found {
    public static void main(String[] args) {
        
        String[] words = {"start", "run", "exit", "end"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("exit")) {
                break; // stop loop
            }
            System.out.println(words[i]);
        }
    }
}

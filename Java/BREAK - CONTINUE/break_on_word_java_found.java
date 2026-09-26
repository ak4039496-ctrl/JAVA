// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when word "Java" is found

public class break_on_word_java_found {
    public static void main(String[] args) {
        
        String[] words = {"hello", "world", "Java", "program"};
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Java")) {
                break; // stop loop
            }
            System.out.println(words[i]);
        }
    }
}

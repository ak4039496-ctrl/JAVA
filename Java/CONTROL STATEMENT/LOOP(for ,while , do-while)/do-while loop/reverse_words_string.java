// Author: Amit Gupta
// Date: 06-09-2026
// Program: Reverse words in a string

public class reverse_words_string {
    public static void main(String[] args) {
        String str = "JAVA PROGRAMMING";
        String[] words = str.split(" ");
        int i = words.length - 1;
        do {
            System.out.print(words[i] + " ");
            i--;
        } while (i >= 0);
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print ASCII values of lowercase letters 

public class print_ascii_lowercase {
    public static void main(String[] args) {
        char ch = 'a'; // start with a

        while (ch <= 'z') {
            System.out.println(ch + " => " + (int)ch); // print ASCII
            ch++; // move to next character
        }
    }
}

// Author: Amit Gupta
// Date: 16-09-2026
// Program: Print ASCII values of characters A to Z

public class ascii_values {
    public static void main(String[] args) {
        char ch = 'A';
        do {
            System.out.println(ch + " => " + (int)ch);
            ch++;
        } while (ch <= 'Z');
    }
}

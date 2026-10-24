// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print ASCII values of digits 0–9 

public class print_ascii_digits {
    public static void main(String[] args) {
        char ch = '0'; // start with 0

        while (ch <= '9') {
            System.out.println(ch + " => " + (int)ch); // print ASCII
            ch++; // move to next digit
        }
    }
}

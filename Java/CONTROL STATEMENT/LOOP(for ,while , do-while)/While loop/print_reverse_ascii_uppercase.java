// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print ASCII values of uppercase letters in reverse using while loop

public class print_reverse_ascii_uppercase {
    public static void main(String[] args) {
        char ch = 'Z'; // start with Z

        while (ch >= 'A') {
            System.out.println(ch + " = " + (int)ch); // print ASCII
            ch--; // move backward
        }
    }
}

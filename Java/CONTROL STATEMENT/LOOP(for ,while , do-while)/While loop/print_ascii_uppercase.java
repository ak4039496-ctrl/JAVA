// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print ASCII values of uppercase letters 

public class print_ascii_uppercase {
    public static void main(String[] args) {
        char ch = 'A'; // start with A

        while (ch <= 'Z') {
            System.out.println(ch + " => " + (int)ch); // print ASCII
            ch++; // move to next character
        }
    }
}

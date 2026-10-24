// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print alphabets in reverse order using while loop

public class print_reverse_alphabets {
    public static void main(String[] args) {
        char ch = 'Z'; // start with Z

        while (ch >= 'A') {
            System.out.println(ch); // print current alphabet
            ch--; // move backward
        }
    }
}

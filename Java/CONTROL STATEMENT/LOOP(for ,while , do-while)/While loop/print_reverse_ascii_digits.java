// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print ASCII values of digits 9–0 in reverse 

public class print_reverse_ascii_digits {
    public static void main(String[] args) {
        char ch = '9'; // start with 9

        while (ch >= '0') {
            System.out.println(ch + " => " + (int)ch); // print ASCII
            ch--; // move backward
        }
    }
}

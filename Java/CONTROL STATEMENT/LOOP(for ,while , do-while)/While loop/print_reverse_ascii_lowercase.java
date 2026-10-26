// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print ASCII values of lowercase letters in reverse 

public class print_reverse_ascii_lowercase {
    public static void main(String[] args) {
        char ch = 'z'; // start with z

        while (ch >= 'a') {
            System.out.println(ch + " => " + (int)ch); // print ASCII
            ch--; // move backward
        }
    }
}

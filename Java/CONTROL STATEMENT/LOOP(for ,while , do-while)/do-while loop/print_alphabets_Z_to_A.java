// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print alphabets Z to A

public class print_alphabets_Z_to_A {
    public static void main(String[] args) {
        char ch = 'Z'; //  Start from Z
        do {
            System.out.print(ch + " "); //  Print character
            ch--; //  Previous character
        } while (ch >= 'A'); //  Condition check
    }
}

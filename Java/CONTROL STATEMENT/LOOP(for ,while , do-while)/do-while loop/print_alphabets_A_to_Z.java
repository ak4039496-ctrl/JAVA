// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print alphabets A to Z

public class print_alphabets_A_to_Z {
    public static void main(String[] args) {
        char ch = 'A'; //  Start from A
        do {
            System.out.print(ch + " "); //  Print character
            ch++; //  Next character
        } while (ch <= 'Z'); //  Condition check
    }
}

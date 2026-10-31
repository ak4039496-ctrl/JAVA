// Author: Amit Gupta
// Date: 06-09-2026
// Program: Reverse digits of a number

public class reverse_digits {
    public static void main(String[] args) {
        int num = 123; //  Input number
        int rev = 0; //  Initialize reverse
        do {
            int digit = num % 10; //  Extract last digit
            rev = rev * 10 + digit; // Build reverse
            num /= 10; // Remove last digit
        } while (num > 0); //  Condition check
        System.out.println("Reversed => " + rev); // Print result
    }
}

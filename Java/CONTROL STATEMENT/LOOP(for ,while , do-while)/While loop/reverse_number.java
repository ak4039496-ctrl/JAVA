// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reverse a number 

public class reverse_number {
    public static void main(String[] args) {
        int num = 456; // number to reverse
        int rev = 0;   // store reverse

        while (num > 0) {
            int digit = num % 10; // extract last digit
            rev = rev * 10 + digit; // build reverse
            num /= 10; // remove last digit
        }

        System.out.println("Reverse => " + rev);
    }
}

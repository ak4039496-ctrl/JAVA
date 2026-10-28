// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reverse number 12345
public class reverse_number_12345 {
    public static void main(String[] args) {
        int num = 12345; // number to reverse
        int rev = 0; // variable to store reverse

        while (num > 0) {
            int digit = num % 10; // extract last digit
            rev = rev * 10 + digit; // build reverse number
            num /= 10; // remove last digit
        }

        System.out.println("Reverse = " + rev);
    }
}

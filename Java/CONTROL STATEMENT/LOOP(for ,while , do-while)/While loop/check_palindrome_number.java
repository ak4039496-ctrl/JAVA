// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if number 121 is palindrome 

public class check_palindrome_number {
    public static void main(String[] args) {
        int num = 121; // number to check
        int temp = num; // store original number
        int rev = 0; // variable to store reverse

        while (num > 0) {
            int digit = num % 10; // extract last digit
            rev = rev * 10 + digit; // build reverse number
            num /= 10; // remove last digit
        }

        if (temp == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not palindrome");
        }
    }
}

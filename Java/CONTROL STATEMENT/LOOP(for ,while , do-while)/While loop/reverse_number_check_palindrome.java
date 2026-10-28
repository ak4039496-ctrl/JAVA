// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reverse a number and check if it is palindrome 
public class reverse_number_check_palindrome {
    public static void main(String[] args) {
        int num = 121; // number to check
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        if (num == rev) {
            System.out.println(num + " is Palindrome Number");
        } else {
            System.out.println(num + " is Not Palindrome Number");
        }
    }
}

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is palindrome (121 → palindrome)

public class palindrome_number {
    public static void main(String[] args) {
        int num = 121; //  Input number
        int temp = num; // Store original number
        int rev = 0; //  Initialize reverse
        do {
            int digit = temp % 10; //  Extract digit
            rev = rev * 10 + digit; // Build reverse
            temp /= 10; // Remove last digit
        } while (temp > 0); //  Condition check
        if (rev == num) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }
    }
}

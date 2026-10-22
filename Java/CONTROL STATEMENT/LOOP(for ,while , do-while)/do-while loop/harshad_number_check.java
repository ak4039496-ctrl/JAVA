// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Harshad (divisible by sum of digits)

public class harshad_number_check {
    public static void main(String[] args) {
        int num = 18; //  Input number
        int temp = num; // Store original
        int sum = 0; //  Initialize sum
        do {
            int digit = temp % 10; //  Extract digit
            sum += digit; //  Add digit to sum
            temp /= 10; //  Remove last digit
        } while (temp > 0); // Condition check
        if (num % sum == 0) {
            System.out.println(num + " is Harshad");
        } else {
            System.out.println(num + " is Not Harshad");
        }
    }
}

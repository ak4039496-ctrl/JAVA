// Author: Amit Gupta
// Date: 16-09-2026
// Program: Check if a number is Magic (sum of digits repeated until single digit = 1)

public class magic_number_check {
    public static void main(String[] args) {
        int num = 19; // Input number
        int sum;
        do {
            sum = 0; // Reset sum
            int temp = num; //  Copy number
            do {
                int digit = temp % 10; // Extract digit
                sum += digit; //  Add digit
                temp /= 10; //  Remove digit
            } while (temp > 0); //  Condition check
            num = sum; // Update num
        } while (num > 9); //  Repeat until single digit
        if (num == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }
    }
}

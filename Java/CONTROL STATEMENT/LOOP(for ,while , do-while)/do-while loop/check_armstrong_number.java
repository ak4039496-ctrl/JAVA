// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if number 153 is Armstrong using while loop

public class check_armstrong_number {
    public static void main(String[] args) {
        int num = 153; // number to check
        int temp = num; // store original number
        int sum = 0; // variable to store sum of cubes

        while (num > 0) {
            int digit = num % 10; // extract last digit
            sum += digit * digit * digit; // add cube of digit
            num /= 10; // remove last digit
        }

        if (temp == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

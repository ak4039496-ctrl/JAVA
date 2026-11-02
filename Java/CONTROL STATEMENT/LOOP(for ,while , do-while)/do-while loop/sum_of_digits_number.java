// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of digits of number

public class sum_of_digits_number {
    public static void main(String[] args) {
        int num = 2468; //  Input number
        int sum = 0; //Initialize sum
        do {
            int digit = num % 10; // Extract digit
            sum += digit; // Add digit
            num /= 10; //  Remove digit
        } while (num > 0); //  Condition check
        System.out.println("Sum => " + sum); //Print result
    }
}

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find sum of factors of a number

public class factor_sum {
    public static void main(String[] args) {
        int num = 12; // Input number
        int i = 1; //  Start from 1
        int sum = 0; // Initialize sum
        do {
            if (num % i == 0) { //  Check divisor
                sum += i; // Add factor 
            }
            i++; // Increment
        } while (i <= num); //  Condition check
        System.out.println("Sum of factors => " + sum); //  Print result
    }
}

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find GCD of two numbers (example: 48, 18)

public class gcd_of_two {
    public static void main(String[] args) {
        int a = 48; //  Input first number
        int b = 18; //  Input second number
        int gcd = 1; //  Initialize gcd
        int i = 1; //  Counter
        do {
            if (a % i == 0 && b % i == 0) { // Check divisor
                gcd = i; // Update gcd
            }
            i++; //  Increment counter
        } while (i <= a ); //  Condition check
        System.out.println("GCD => " + gcd); //  Print result
    }
}

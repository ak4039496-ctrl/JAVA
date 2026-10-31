// Author: Amit Gupta
// Date: 06-07-2026
// Program: Print prime factors of a number

public class prime_factors_any {
    public static void main(String[] args) {
        int num = 84; //  Input number
        int i = 2; //  Start divisor
        do {
            if (num % i == 0) { // Check divisibility
                System.out.print(i + " "); //  Print factor
                num /= i; // Reduce number
            } else {
                i++; //  Next divisor
            }
        } while (num > 1); //  Condition check
    }
}

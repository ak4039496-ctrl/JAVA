// Author: Amit Gupta
// Date: 11-09-2026
// Program: Calculate power (example: 2^5)

public class power_calculation {
    public static void main(String[] args) {
        int base = 2; // Input base
        int exp = 5; //  Input exponent
        int result = 1; //  Initialize result
        int i = 1; // Counter
        do {
            result *= base; // Multiply result by base
            i++; //  Increment counter
        } while (i <= exp); //  Condition check
        System.out.println(base + "^" + exp + " => " + result); //  Print result
    }
}

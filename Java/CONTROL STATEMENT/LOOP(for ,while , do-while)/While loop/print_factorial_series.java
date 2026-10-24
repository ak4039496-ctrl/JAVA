// Author: Amit Gupta
// Date: 15-09-2026
// Program: Print factorials of numbers from 1 to 5 

public class print_factorial_series {
    public static void main(String[] args) {
        int n = 5; // limit
        int i = 1; // start with 1

        // loop until i <= n
        while (i <= n) {
            int fact = 1; // reset factorial for each number
            int j = 1; // inner counter

            // calculate factorial of i
            while (j <= i) {
                fact *= j; // multiply fact by j
                j++; // move to next
            }

            System.out.println("Factorial of " + i + " => " + fact);
            i++; // move to next number
        }
    }
}

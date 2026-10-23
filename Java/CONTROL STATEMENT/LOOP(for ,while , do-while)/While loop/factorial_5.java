// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find factorial of 5 using while loop

public class factorial_5 {
    public static void main(String[] args) {
        int i = 1; // counter starts at 1
        int fact = 1; // variable to store factorial

        while (i <= 5) {
            fact *= i; // multiply fact by current i
            i++; // move to next number
        }

        System.out.println("Factorial of 5 => " + fact);
    }
}

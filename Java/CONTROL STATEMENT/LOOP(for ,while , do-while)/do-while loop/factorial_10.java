// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find factorial of 10

public class factorial_10 {
    public static void main(String[] args) {
        int i = 1, fact = 1; //  Initialize
        do {
            fact *= i; //  Multiply and store value
            i++; //  Increment
        } while (i <= 10); //  Condition check
        System.out.println("Factorial => " + fact);
    }
}

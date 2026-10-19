// Author: Amit Gupta
// Date: 06-09-2026
// Program: Count digits in a number

public class count_digits {
    public static void main(String[] args) {
        int num = 12345; // Input number
        int count = 0; // Initialize counter
        do {
            num /= 10; // Remove last digit
            count++; //  Increment count
        } while (num > 0); // Condition check
        System.out.println("Digits => " + count); //  Print result
    }
}

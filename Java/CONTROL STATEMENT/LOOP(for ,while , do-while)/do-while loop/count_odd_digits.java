// Author: Amit Gupta
// Date: 06-09-2026
// Program: Count odd digits in a number

public class count_odd_digits {
    public static void main(String[] args) {
        int num = 123456; //  Input number
        int count = 0; //  Initialize counter
        do {
            int digit = num % 10; //  Extract digit
            if (digit % 2 != 0) { //  Check odd
                count++; //  Increment counter
            }
            num /= 10; //  Remove last digit
        } while (num > 0); //  Condition check
        System.out.println("Odd digits count = " + count); // Print result
    }
}

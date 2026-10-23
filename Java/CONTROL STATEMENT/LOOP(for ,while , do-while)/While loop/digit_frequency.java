// Author: Amit Gupta
// Date: 05-09-2026
// Program: Count frequency of digit 5 in a number 

public class digit_frequency {
    public static void main(String[] args) {
        int num = 155525; // number to check
        int count = 0;    // frequency counter

        while (num > 0) {
            int digit = num % 10; // extract digit
            if (digit == 5) {
                count++; // increase if digit is 5
            }
            num /= 10; // remove digit
        }

        System.out.println("Frequency of 5 => " + count);
    }
}

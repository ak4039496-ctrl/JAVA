// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print digits of a number in reverse order

public class print_reverse_digits {
    public static void main(String[] args) {
        int num = 9876; // number to process

        // loop until num > 0
        while (num > 0) {
            int digit = num % 10; // extract last digit
            System.out.println(digit); // print digit
            num /= 10; // remove last digit
        }
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of even digits in a number 

public class sum_even_digits {
    public static void main(String[] args) {
        int num = 987654; // number to process
        int sum = 0;      // store sum

        while (num > 0) {
            int digit = num % 10; // extract digit
            if (digit % 2 == 0) {
                sum += digit; // add if even
            }
            num /= 10; // remove digit
        }

        System.out.println("Sum of even digits => " + sum);
    }
}

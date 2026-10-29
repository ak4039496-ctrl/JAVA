// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of alternate numbers from 1 to 20 using while loop

public class sum_alternate_numbers {
    public static void main(String[] args) {
        int i = 1; // start with 1
        int sum = 0;

        while (i <= 20) {
            sum += i; // add current number
            i += 2; // skip one number
        }

        System.out.println("Sum of alternate numbers => " + sum);
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of first 50 natural numbers 

public class sum_first_50_numbers {
    public static void main(String[] args) {
        int i = 1; // start with 1
        int sum = 0; // variable to store sum

        while (i <= 50) {
            sum += i; // add current number
            i++; // move to next number
        }

        System.out.println("Sum of first 50 numbers => " + sum);
    }
}

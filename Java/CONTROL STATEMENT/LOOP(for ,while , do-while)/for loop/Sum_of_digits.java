/*
Author: Amit Gupta
Date: 05-09-2026
Program: Find sum of digits of a number
*/

public class Sum_of_digits {
    public static void main(String[] args) {
        int num = 987;
        int sum = 0;

        for(; num > 0; num /= 10) {
            sum += num % 10;
        }

        System.out.println("Sum of digits => " + sum);
    }
}

/*
Author: Amit Gupta
Date: 05-09-2026
Program: Sum of first 5 numbers
*/

public class Sum_of_first_5_numbers {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum => " + sum);
    }
}

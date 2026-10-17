/*
Author: Amit Gupta
Date: 05-09-2026
Program: Sum of even numbers 1 to 20
*/

public class Sum_of_even_numbers_1_to_20 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 20; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers => " + sum);
    }
}

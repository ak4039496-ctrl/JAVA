/*
Author: Amit Gupta
Date: 05-09-2026
Program: Count digits in a number
*/

public class Count_digits_in_number {
    public static void main(String[] args) {
        int num = 98765;
        int count = 0;

        for(; num > 0; num /= 10) {
            count++;
        }

        System.out.println("Total digits => " + count);
    }
}

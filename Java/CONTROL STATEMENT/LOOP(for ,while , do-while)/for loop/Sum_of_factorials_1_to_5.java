/*
Author: Amit Gupta
Date: 05-09-2026
Program: Sum of factorials from 1 to 5
*/

public class Sum_of_factorials_1_to_5 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            int fact = 1;
            for(int j = 1; j <= i; j++) {
                fact *= j;
            }
            sum += fact;
        }

        System.out.println("Sum of factorials => " + sum);
    }
}

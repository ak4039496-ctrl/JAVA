/*
Author: Amit Gupta
Date: 05-09-2026
Program: Sum of squares 1 to 10
*/

public class Sum_of_squares_1_to_10 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += (i * i);
        }
        System.out.println("Sum of squares => " + sum);
    }
}

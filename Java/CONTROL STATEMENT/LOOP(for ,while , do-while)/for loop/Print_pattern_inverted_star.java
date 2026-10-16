/*
Author: Amit Gupta
Date: 05-09-2026
Program: Print inverted star pattern
*/

public class Print_pattern_inverted_star {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Author: Amit Gupta
Date: 05-09-2026
Program: Print star triangle pattern
*/

public class Print_pattern_star_triangle {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

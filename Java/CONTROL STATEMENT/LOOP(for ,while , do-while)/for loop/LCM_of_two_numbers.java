/*
Author: Amit Gupta
Date: 05-09-2026
Program: Find LCM of two numbers
*/

public class LCM_of_two_numbers {
    public static void main(String[] args) {
        int a = 12, b = 15;
        int lcm = (a * b);

        for(int i = 1; i <= lcm; i++) {
            if(i % a == 0 && i % b == 0) {
                lcm = i; // 60
                break;
            }
        }

        System.out.println("LCM => " + lcm);
    }
}

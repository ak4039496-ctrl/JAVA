/*
Author: Amit Gupta
Date: 05-09-2026
Program: Check if a number is Neon
*/

public class Check_neon_number {
    public static void main(String[] args) {
        int num = 9;
        int square = num * num;
        int sum = 0;

        for(; square > 0; square /= 10) {
            sum += square % 10;
        }

        if(sum == num) { // 9^2=81 and 8+1= 9
            System.out.println(num + " is Neon number");
        } else {
            System.out.println(num + " is Not Neon number");
        }
    }
}

/*
Author: Amit Gupta
Date: 05-09-2026
Program: Check if a number is Strong number
*/

public class Check_strong_number {
    public static void main(String[] args) {
        int num = 145;
        int sum = 0, temp = num;

        for(; temp > 0; temp /= 10) {
            int digit = temp % 10;
            int fact = 1;
            for(int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact; // 120+24+1 = 145
        }

        if(sum == num) {
            System.out.println(num + " is Strong number");
        } else {
            System.out.println(num + " is Not Strong number");
        }
    }
}

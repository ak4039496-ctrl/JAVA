/*
Author: Amit Gupta
Date: 05-09-2026
Program: Check if a number is Harshad
*/

public class Check_harshad_number {
    public static void main(String[] args) {
        int num = 18;
        int sum = 0, temp = num;

        for(; temp > 0; temp /= 10) {
            sum += temp % 10;
        }

        if(num % sum == 0) {
            System.out.println(num + " is Harshad number"); // 18%9 == 0
        } else {
            System.out.println(num + " is Not Harshad number");
        }
    }
}

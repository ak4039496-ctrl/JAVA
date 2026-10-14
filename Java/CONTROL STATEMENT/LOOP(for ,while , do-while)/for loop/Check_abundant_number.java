/*
Author: Amit Gupta
Date: 05-09-2026
Program: Check if a number is Abundant
*/

public class Check_abundant_number {
    public static void main(String[] args) {
        int num = 12;
        int sum = 0;

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }

        if(sum > num) { //16>12
            System.out.println(num + " is Abundant number");
        } else {
            System.out.println(num + " is Not Abundant number");
        }
    }
}

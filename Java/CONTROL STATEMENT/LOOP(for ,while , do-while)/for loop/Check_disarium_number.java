/*
Author: Amit Gupta
Date: 05-19-2026
Program: Check if a number is Disarium
*/

public class Check_disarium_number {
    public static void main(String[] args) {
        int num = 135;
        int sum = 0, temp = num;
        int length = String.valueOf(num).length();

        for(int i = length; temp > 0; i--) {
            int digit = temp % 10; 
            int pow = 1;
            for(int j = 1; j <= i; j++) {
                pow *= digit;
            }
            sum += pow;
            temp /= 10;
        }

        if(sum == num) {
            System.out.println(num + " is Disarium number");
        } else {
            System.out.println(num + " is Not Disarium number");
        }
    }
}

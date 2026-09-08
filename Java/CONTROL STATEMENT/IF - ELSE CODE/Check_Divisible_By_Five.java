/*
Author: Amit Gupta
Date: 16-Aug-2026
Program: Check if a number is divisible by 5
*/

public class Check_Divisible_By_Five {
    public static void main(String[] args) {
        int num = 25;

        // if-else to check divisibility
        if(num % 5 == 0) {
            System.out.println(num + " is Divisible by 5");
        } else {
            System.out.println(num + " is Not Divisible by 5");
        }
    }
}

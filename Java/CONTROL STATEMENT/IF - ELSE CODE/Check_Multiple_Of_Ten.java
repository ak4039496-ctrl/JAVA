/*
Author: Amit Gupta
Date: 23-Aug-2026
Program: Check if a number is a multiple of 10
*/

public class Check_Multiple_Of_Ten {
    public static void main(String[] args) {
        int num = 40;

        // if-else to check multiple of 10
        if(num % 10 == 0) {
            System.out.println(num + " is a Multiple of 10");
        } else {
            System.out.println(num + " is Not a Multiple of 10");
        }
    }
}

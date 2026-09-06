/*
Author: Amit Gupta
Date: 16-Aug-2026
Program: Find absolute value of a number
*/

public class Check_Absolute_Value {
    public static void main(String[] args) {
        int num = -12;

        // if-else to find absolute value
        if(num < 0) {
            num = -num;
        }
        System.out.println("Absolute Value: " + num);
    }
}

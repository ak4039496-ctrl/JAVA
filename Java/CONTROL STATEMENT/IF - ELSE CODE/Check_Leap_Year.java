/*
Author: Amit Gupta
Date: 16-Aug-2026
Program: Check if a year is a Leap Year
*/

public class Check_Leap_Year {
    public static void main(String[] args) {
        int year = 2024;

        // if-else to check leap year
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }
}

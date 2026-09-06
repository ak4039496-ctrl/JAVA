/*
Author: Amit Gupta
Date: 16-Aug-2026
Program: Check voting eligibility based on age
*/

public class Check_Age_Eligibility {
    public static void main(String[] args) {
        int age = 18;

        // if-else to check voting eligibility
        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }
}

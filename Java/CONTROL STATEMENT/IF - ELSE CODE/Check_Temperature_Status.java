/*
Author: Amit Gupta
Date: 25-Aug-2026
Program: Check if temperature is Hot or Cold
*/

import java.util.Scanner;

public class Check_Temperature_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius:- ");
        int temp = sc.nextInt();

        if(temp >= 30) {
            System.out.println("Hot Weather");
        } else {
            System.out.println("Cold Weather");
        }
    }
}

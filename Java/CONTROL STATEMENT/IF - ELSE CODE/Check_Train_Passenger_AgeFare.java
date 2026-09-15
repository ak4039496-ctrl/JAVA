/*
Author: Amit Gupta
Date: 24-Aug-2026
Program: Check train fare based on passenger age
*/

import java.util.Scanner;

public class Check_Train_Passenger_AgeFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger age:- ");
        int age = sc.nextInt();

        if(age <= 12) {
            System.out.println("Child Fare: Rs. 200");
        } else if(age >= 60) {
            System.out.println("Senior Citizen Fare: Rs. 250");
        } else {
            System.out.println("Regular Fare: Rs. 300");
        }

        sc.close(); 
    }
}

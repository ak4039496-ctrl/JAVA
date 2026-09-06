/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check age category using if-else
*/

import java.util.Scanner;

public class Check_Age_Category {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(age < 13) {
            System.out.println("Category: Child");
        } else if(age < 20) {
            System.out.println("Category: Teenager");
        } else if(age < 60) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior Citizen");
        }

        sc.close();
    }
}

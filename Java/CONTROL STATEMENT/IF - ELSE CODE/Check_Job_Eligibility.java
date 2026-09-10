/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if candidate is eligible for job based on qualification
*/

import java.util.Scanner;

public class Check_Job_Eligibility {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter qualification (BCA/MCA/Other):- ");
        String qualification = sc.next();

        if(qualification.equalsIgnoreCase("BCA") || qualification.equalsIgnoreCase("MCA")) {
            System.out.println("Eligible for IT Job");
        } else {
            System.out.println("Not Eligible for IT Job");
        }
    }
}

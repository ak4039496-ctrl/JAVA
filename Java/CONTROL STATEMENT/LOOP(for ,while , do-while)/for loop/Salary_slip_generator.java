/*
Author: Amit Gupta
Date: 05-10-2026
Program: Salary Slip Generator
*/

public class Salary_slip_generator {
    public static void main(String[] args) {
        double basic = 15000;
        double hra = 5000;
        float da = 3000;
        double deductions = 2000;

        double gross = basic + hra + da;
        double net = gross - deductions;

        System.out.println("-- Salary Slip --");
        System.out.println("Basic Pay = Rs. " + basic);
        System.out.println("HRA = Rs. " + hra);
        System.out.println("DA = Rs. " + da);
        System.out.println("Gross Salary = Rs. " + gross);
        System.out.println("Deductions = Rs. " + deductions);
        System.out.println("Net Salary = Rs. " + net);
    }
}

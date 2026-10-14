/*
Author: Amit Gupta
Date: 05-09-2026
Program: Calculate electricity bill
*/

public class Electricity_bill_calculator {
    public static void main(String[] args) {
        int units = 120;
        double bill = 0;

        for(int i = 1; i <= units; i++) {
            if(i <= 50) bill += 3.0;
            else if(i <= 100) bill += 4.0;
            else bill += 5.0;
        }

        System.out.println("Total Bill => Rs. " + bill);
    }
}

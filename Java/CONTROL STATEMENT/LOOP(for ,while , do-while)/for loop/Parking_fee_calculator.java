/*
Author: Amit Gupta
Date: 05-09-2026
Program: Parking Fee Calculator
*/
public class Parking_fee_calculator {
    public static void main(String[] args) {
        int hours = 4;
        int rate = 20; // per hour

        int fee = hours* rate;
        System.out.println("Parking Fee => Rs."+fee);
    }
}

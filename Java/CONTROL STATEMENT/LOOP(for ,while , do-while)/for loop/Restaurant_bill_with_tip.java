/*
Author: Amit Gupta
Date: 05-09-2026
Program: Restaurant Bill with Tip
*/

public class Restaurant_bill_with_tip {
    public static void main(String[] args) {
        int food = 800;
        int drinks = 200;
        double tip = 0.1 * (food + drinks);

        double total = food + drinks + tip;
        System.out.println("Total Bill (with tip) => Rs. " + total);
    }
}

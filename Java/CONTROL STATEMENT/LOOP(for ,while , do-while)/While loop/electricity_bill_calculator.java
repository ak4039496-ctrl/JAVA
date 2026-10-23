// Author: Amit Gupta
// Date: 05-09-2026
// Program: Calculate electricity bill using while loop

import java.util.Scanner;

public class electricity_bill_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed:- ");
        int units = sc.nextInt();
        int i = 1;
        double bill = 0;

        while (i <= units) {
            if (i <= 100) {
                bill += 5; // Rs.5 per unit for first 100
            } else if (i <= 200) {
                bill += 7; // Rs.7 per unit for next 100
            } else {
                bill += 10; // Rs.10 per unit above 200
            }
            i++;
        }

        System.out.println("Total Bill => Rs." + bill);
    }
}

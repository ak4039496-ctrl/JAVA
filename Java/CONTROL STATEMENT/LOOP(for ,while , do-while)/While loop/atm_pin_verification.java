// Author: Amit Gupta
// Date: 05-09-2026
// Program: ATM PIN verification using while loop

import java.util.Scanner;

public class atm_pin_verification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234; // stored PIN
        int attempts = 0; // count attempts

        while (attempts < 3) { // allow max 3 attempts
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Access Granted!");
                break; // exit loop if correct
            } else {
                System.out.println("Wrong PIN!");
                attempts++; // increase attempt
            }
        }

        if (attempts == 3) {
            System.out.println("Card Blocked!");
        }
    }
}

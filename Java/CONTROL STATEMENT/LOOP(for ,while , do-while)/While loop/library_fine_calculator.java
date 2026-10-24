// Author: Amit Gupta
// Date: 05-09-2026
// Program: Library fine calculation 

import java.util.Scanner;

public class library_fine_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int days = sc.nextInt();
        int i = 1;
        int fine = 0;

        while (i <= days) {
            if (i <= 5) {
                fine += 2; // Rs.2 per day for first 5 days
            } else if (i <= 10) {
                fine += 5; // Rs.5 per day for next 5 days
            } else {
                fine += 10; // Rs.10 per day after 10 days
            }
            i++;
        }

        System.out.println("Total Fine => Rs." + fine);
    }
}

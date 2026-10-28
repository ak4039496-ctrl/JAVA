// Author: Amit Gupta
// Date: 05-09-2026using while loop

import java.util.Scanner;

public class shopping_cart_total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items;
        System.out.print("Enter number of items: ");
        items = sc.nextInt();

        int i = 1;
        double total = 0;

        while (i <= items) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            total += price; // add item price
            i++;
        }

        System.out.println("Total Shopping Bill => Rs." + total);
    }
}

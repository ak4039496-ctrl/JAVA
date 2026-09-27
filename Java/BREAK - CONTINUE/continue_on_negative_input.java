// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip negative numbers entered by user

import java.util.Scanner;

public class continue_on_negative_input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number:- ");
            int num = sc.nextInt();
            
            if (num < 0) {
                continue; // skip negative
            }
            
            System.out.println("You entered:- " + num);
        }
    }
}

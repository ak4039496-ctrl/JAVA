// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when user enters negative number

import java.util.Scanner;

public class break_on_negative_input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number:- ");
            int num = sc.nextInt();
            
            if (num < 0) {
                break; 
            }
            
            System.out.println("You entered:- " + num);
        }
    }
}

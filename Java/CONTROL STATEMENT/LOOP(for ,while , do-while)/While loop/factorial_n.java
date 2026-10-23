// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find factorial of n using while loop
import java.util.Scanner;

public class factorial_n {
    public static void main(String[] args) {
        Scanner nc=new Scanner(System.in);
        System.out.print("Enter your no. :");
        int n=nc.nextInt(); // number to find factorial
        int i = 1; // counter
        int fact = 1; // variable to store factorial

        while (i <= n) {
            fact *= i; // multiply fact by i
            i++; // move to next number
        }

        System.out.println("Factorial of " + n + " => " + fact);
    }
}

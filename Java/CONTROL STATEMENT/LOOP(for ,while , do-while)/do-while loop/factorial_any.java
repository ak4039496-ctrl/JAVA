
import java.util.Scanner;

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find factorial of any number (example: 6)
public class factorial_any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no. :- ");
        int num =sc.nextInt(); // Input number
        int i = 1; //  Initialize counter
        int fact = 1; //  Initialize factorial
        do {
            fact *= i; // Multiply fact by i
            i++; // Increment i
        } while (i <= num); //  Condition check
        System.out.println("Factorial => " + fact); // Step 7: Print result
    }
}

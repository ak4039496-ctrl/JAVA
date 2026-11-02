// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of odd numbers from 1 to 20

public class sum_odd_1_to_20 {
    public static void main(String[] args) {
        int i = 1; // Start from first odd number
        int sum = 0; //Initialize sum
        do {
            sum += i; // Add i to sum
            i += 2; // Increment by 2
        } while (i <= 20); // Condition check
        System.out.println("Sum of odd => " + sum); //Print result
    }
}

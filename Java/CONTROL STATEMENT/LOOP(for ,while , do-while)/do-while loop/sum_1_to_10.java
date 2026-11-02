// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of numbers from 1 to 10

public class sum_1_to_10 {
    public static void main(String[] args) {
        int i = 1; // Initialize counter
        int sum = 0; // Initialize sum
        do {
            sum += i; // Add i to sum
            i++; // Increment i
        } while (i <= 10); // Condition check
        System.out.println("Sum => " + sum); //Print result
    }
}

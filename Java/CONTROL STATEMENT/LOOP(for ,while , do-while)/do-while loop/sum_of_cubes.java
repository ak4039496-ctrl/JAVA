// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of cubes of first 10 numbers

public class sum_of_cubes {
    public static void main(String[] args) {
        int i = 1; // Initialize counter
        int sum = 0; //Initialize sum
        do {
            sum += i * i * i; // Add cube
            i++; // Increment i
        } while (i <= 10); //  Condition check
        System.out.println("Sum of cubes => " + sum); // Print result
    }
}

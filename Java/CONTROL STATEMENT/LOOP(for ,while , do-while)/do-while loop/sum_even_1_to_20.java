// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of even numbers from 1 to 20

public class sum_even_1_to_20 {
    public static void main(String[] args) {
        int i = 2; //  Start from first even number
        int sum = 0; // Initialize sum
        do {
            sum += i; //  Add i to sum
            i += 2; // Increment by 2
        } while (i <= 20); //  Condition check
        System.out.println("Sum of even => " + sum); //  Print result
    }
}

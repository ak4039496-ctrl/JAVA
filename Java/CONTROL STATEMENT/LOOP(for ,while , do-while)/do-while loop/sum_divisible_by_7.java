// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of numbers divisible by 7 up to 100

public class sum_divisible_by_7 {
    public static void main(String[] args) {
        int i = 7, sum = 0; // Initialize
        do {
            sum += i; // Add number
            i += 7; // Next multiple
        } while (i <= 100); // Condition check
        System.out.println("Sum => " + sum); //Print result
    }
}

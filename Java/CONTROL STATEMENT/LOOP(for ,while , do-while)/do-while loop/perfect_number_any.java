// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Perfect

public class perfect_number_any {
    public static void main(String[] args) {
        int num = 28; // Step 1: Input number
        int i = 1, sum = 0; // Step 2: Initialize
        do {
            if (num % i == 0) sum += i; // Step 3: Add divisor
            i++; // Step 4: Increment
        } while (i < num); // Step 5: Condition check
        if (sum == num) System.out.println(num + " is Perfect");
        else System.out.println(num + " is Not Perfect");
    }
}

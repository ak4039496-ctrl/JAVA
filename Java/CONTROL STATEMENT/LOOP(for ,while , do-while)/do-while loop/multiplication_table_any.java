// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print multiplication table of any number (example: 7)

public class multiplication_table_any {
    public static void main(String[] args) {
        int num = 7; // Step 1: Input number
        int i = 1; // Step 2: Initialize counter
        do {
            System.out.println(num + " x " + i + " = " + (num * i)); // Step 3: Print table row
            i++; // Step 4: Increment i
        } while (i <= 10); // Step 5: Condition check
    }
}

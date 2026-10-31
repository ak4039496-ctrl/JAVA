// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Spy

public class spy_number_any {
    public static void main(String[] args) {
        int num = 1124; // Step 1: Input number
        int temp = num, sum = 0, product = 1; // Step 2: Initialize
        do {
            int digit = temp % 10; // Step 3: Extract digit
            sum += digit; // Step 4: Add digit
            product *= digit; // Step 5: Multiply digit
            temp /= 10; // Step 6: Remove digit
        } while (temp > 0);
        if (sum == product) System.out.println(num + " is Spy");
        else System.out.println(num + " is Not Spy");
    }
}

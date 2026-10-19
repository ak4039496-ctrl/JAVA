// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Automorphic (square ends with number)

public class automorphic_number_check {
    public static void main(String[] args) {
        int num = 25; // Step 1: Input number
        int square = num * num; // Step 2: Square
        int temp = num; // Step 3: Copy number
        boolean auto = true; // Step 4: Assume true
        do {
            if (temp % 10 != square % 10) { // Step 5: Compare digits
                auto = false; // Step 6: Not automorphic
                break;
            }
            temp /= 10; // Step 7: Remove digit
            square /= 10; // Step 8: Remove digit
        } while (temp > 0); // Step 9: Condition check
        if (auto) {
            System.out.println(num + " is Automorphic");
        } else {
            System.out.println(num + " is Not Automorphic");
        }
    }
}

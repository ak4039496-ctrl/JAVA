// Author: Amit Gupta
// Date: 26-09-2026
// Program: Find LCM of two numbers (example: 12, 18)

public class lcm_of_two {
    public static void main(String[] args) {
        int a = 12; // Input first number
        int b = 18; // Input second number
        int lcm = (a > b) ? a : b; //  Start from larger
        do {
            if (lcm % a == 0 && lcm % b == 0) { //  Check divisibility
                break; //  Found LCM
            }
            lcm++; //  Increment
        } while (true); //  Infinite until break
        System.out.println("LCM => " + lcm); // Step 8: Print result
    }
}

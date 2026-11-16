/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Modulus Using Method
*/

public class mod {

    // Method to find remainder
    static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        int result = modulus(17, 5);

        System.out.println("Remainder => " + result);
    }
}
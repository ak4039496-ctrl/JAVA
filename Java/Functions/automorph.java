/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Automorphic Number Using Method
*/

public class automorph {

    // Method to check automorphic number
    static boolean isAutomorphic(int num) {

        // Square number
        int square = num * num;

        // Compare ending digits
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static void main(String[] args) {

        int num = 25;

        if (isAutomorphic(num))
            System.out.println(num + " is Automorphic");
        else
            System.out.println(num + " is Not Automorphic");
    }
}
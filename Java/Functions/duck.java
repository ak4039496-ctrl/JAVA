/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Duck Number Using Method
*/

public class duck {

    // Method to check duck number
    static boolean isDuck(int num) {

        // Convert number into string
        String str = String.valueOf(num);

        // Check zero after first position
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int num = 1023;

        if (isDuck(num))
            System.out.println(num + " is Duck Number");
        else
            System.out.println(num + " is Not Duck Number");
    }
}
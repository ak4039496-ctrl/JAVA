/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Sunny Number Using Method
*/

public class sunny {

    // Method to check sunny number
    static boolean isSunny(int num) {

        int root = (int) Math.sqrt(num + 1);

        return root * root == num + 1;
    }

    public static void main(String[] args) {

        int num = 8;

        if (isSunny(num))
            System.out.println(num + " is Sunny Number");
        else
            System.out.println(num + " is Not Sunny Number");
    }
}
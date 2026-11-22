/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: String Length Using Method Overloading
*/

public class length {

    // Find length of String
    static int findLength(String str) {

        return str.length();
    }

    // Find length of Integer Number
    static int findLength(int num) {

        return String.valueOf(num).length();
    }

    // Find total elements in array
    static int findLength(int[] arr) {

        return arr.length;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("String Length = "+ findLength("Java"));

        System.out.println("Digit Count = "+ findLength(123456));

        System.out.println("Array Length = "+ findLength(arr));
    }
}
/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Different Things
*/

public class count {

    // Count characters
    static int countData(String str) {

        return str.length();
    }

    // Count array elements
    static int countData(int[] arr) {

        return arr.length;
    }

    public static void main(String[] args) {

        int[] arr ={10,20,30,40};
        System.out.println(countData("Java"));
        System.out.println(countData(arr));
    }
}
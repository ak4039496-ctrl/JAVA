/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Merge Two Arrays
*/

public class array_merge {

    // Method to merge arrays
    static int[] merge(int[] a, int[] b) {

        int[] c = new int[a.length + b.length];

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            c[k++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[k++] = b[i];
        }

        return c;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        int[] b = {4, 5, 6};

        int[] result = merge(a, b);

        for (int num : result) {

            System.out.print(num + " ");
        }
        
        // or

        // for (int i = 0; i < result.length; i++) {

        //     int num = result[i];

        //     System.out.print(num + " ");
        // }
    }
}
/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Union of Arrays
*/

public class union {

    static void union(int[] a, int[] b) {

        for(int num : a)
            System.out.print(num + " ");

        for(int num : b)
            System.out.print(num + " ");
    }

    static void union(String[] a, String[] b) {

        for(String str : a)
            System.out.print(str + " ");

        for(String str : b)
            System.out.print(str + " ");
    }

    public static void main(String[] args) {

        union(new int[]{1,2}, new int[]{3,4});

        System.out.println();

        union(
                new String[]{"Java"},
                new String[]{"Python"}
        );
    }
}
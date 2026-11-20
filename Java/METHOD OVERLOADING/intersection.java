/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Array Intersection Using Method Overloading
*/

public class intersection {

    static void intersect(int[] a, int[] b) {

        for(int x : a) {

            for(int y : b) {

                if(x == y) {
                    System.out.print(x + " ");
                }
            }
        }
    }

    static void intersect(char[] a, char[] b) {

        for(char x : a) {

            for(char y : b) {

                if(x == y) {
                    System.out.print(x + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        intersect(new int[]{1,2,3,4},new int[]{3,4,5,6});

        System.out.println();

        intersect(new char[]{'A','B','C'},new char[]{'B','C','D'});
    }
}
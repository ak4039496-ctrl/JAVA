/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Unique Elements Using Overloading
*/

public class unique {

    static void unique(String str) {

        for(int i=0; i<str.length();i++) {

            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {

                System.out.print(str.charAt(i)+ " ");
            }
        }

        System.out.println();
    }

    static void unique(int[] arr) {

        for(int i=0;i<arr.length;i++) {

            boolean unique =true;

            for(int j=0;j<arr.length;j++) {

                if(i != j && arr[i] ==arr[j]) {
                    unique = false;
                }
            }

            if(unique) {

                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        unique("java");

        unique(new int[]{1,2,2,3,4,4});
    }
}
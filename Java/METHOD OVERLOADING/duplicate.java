/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Duplicate Using Method Overloading
*/

public class duplicate {

    static void duplicate(String str) {

        for(int i=0;i<str.length();i++) {

            for(int j=i+1;j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i)+ " ");
                    break;
                }
            }
        }

        System.out.println();
    }

    static void duplicate(int[] arr) {

        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        duplicate("programming");

        duplicate(new int[]{1,2,2,3,3,4});
    }
}
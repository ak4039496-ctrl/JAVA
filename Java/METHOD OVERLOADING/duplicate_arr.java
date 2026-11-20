/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Duplicate Elements Using Overloading
*/

public class duplicate_arr {

    static void duplicate(int[] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {

                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    static void duplicate(String[] arr) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i].equals(arr[j])) {

                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        duplicate(new int[]{1,2,2,3,3});

        System.out.println();

        duplicate(new String[]{"Java","Java","Python"});
    }
}
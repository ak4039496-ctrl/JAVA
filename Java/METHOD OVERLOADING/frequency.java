/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Frequency Count Using Method Overloading
*/

public class frequency {

    static int count(int[] arr, int key) {

        int count = 0;

        for (int num : arr) {

            if (num == key) {

                count++;
            }
        }

        return count;
    }

    static int count(String str, char ch) {

        int count = 0;

        for (int i = 0;i < str.length();i++) {

            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(count(new int[]{1,2,2,3},2));

        System.out.println(count("programming",'m'));
    }
}
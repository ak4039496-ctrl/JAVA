/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find LCM Using Method Overloading
*/

public class lcm {

    static int lcm(int a, int b) {

        int max = Math.max(a, b);

        while (true) {

            if (max % a == 0 &&max % b == 0) {
                return max;
            }

            max++;
        }
    }

    static int lcm(int a,int b,int c) {

        return lcm(lcm(a, b), c);
    }

    static int lcm(int[] arr) {

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            result = lcm(result, arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 8};

        System.out.println(lcm(4, 6));

        System.out.println(lcm(2, 4, 8));

        System.out.println(lcm(arr));
    }
}
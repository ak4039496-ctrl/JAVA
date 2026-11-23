/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Second Largest Element
 */

public class second_large {

    static int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {

                second = first;
                first = num;

            } else if (num > second && num != first) {

                second = num;
            }
        }

        return second;
    }

    static double secondLargest(double[] arr) {

        double first = Double.MIN_VALUE;

        double second = Double.MIN_VALUE;

        for (double num : arr) {

            if (num > first) {

                second = first;
                first = num;
            } else if (num > second && num != first) {

                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        System.out.println(secondLargest(new int[]{10, 20, 30}));

        System.out.println(secondLargest(new double[]{1.5, 2.5, 3.5}));
    }
}

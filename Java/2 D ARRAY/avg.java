/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find average of all elements in a matrix
*/

public class avg {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 66},
            {70, 80, 90}
        };

        int sum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                count++;
            } 
        }

        double average = (double) sum / count;
        System.out.println("Average => " + average);
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Find sum of positive elements in array

public class array_sum_positive {
    public static void main(String[] args) {
        int[] arr = {-5, 10, -3, 7, 2};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of Positive = " + sum);
    }
}

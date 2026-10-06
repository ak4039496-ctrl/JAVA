// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than sum of first and last

public class array_greater_than_first_last_sum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 140, 50};
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println("Sum of First and Last => " + sum);
        System.out.print("Elements greater than sum: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > sum) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

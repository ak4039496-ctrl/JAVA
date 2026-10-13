// Author: Amit Gupta
// Date: 18-09-2026
// Program: Find sum of even elements in array

public class array_sum_even {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of Even => " + sum);
    }
}

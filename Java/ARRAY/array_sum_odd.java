// Author: Amit Gupta
// Date: 18-09-2026
// Program: Find sum of odd elements in array

public class array_sum_odd {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of Odd => " + sum);
    }
}

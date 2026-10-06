// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than sum of first two

public class array_greater_than_first_two_sum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 40, 50};
        int sum = arr[0] + arr[1];
        System.out.println("Sum of first two => " + sum);
        System.out.print("Greater than sum: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > sum) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

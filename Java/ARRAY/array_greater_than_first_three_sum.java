// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than sum of first three

public class array_greater_than_first_three_sum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 30};
        int sum = arr[0] + arr[1] + arr[2];
        System.out.println("Sum of first three => " + sum);
        System.out.print("Greater than sum: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > sum) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

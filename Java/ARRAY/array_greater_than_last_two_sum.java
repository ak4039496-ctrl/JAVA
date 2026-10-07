// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than sum of last two

public class array_greater_than_last_two_sum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 515, 20, 25};
        int sum = arr[arr.length - 1] + arr[arr.length - 2];
        System.out.println("Sum of last two => " + sum);
        System.out.print("Greater than sum: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > sum) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print second half of array

public class array_second_half {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int mid = arr.length / 2;
        System.out.print("Second Half: ");
        for(int i = mid; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

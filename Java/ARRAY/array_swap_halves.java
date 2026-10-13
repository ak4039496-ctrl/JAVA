// Author: Amit Gupta
// Date: 28-09-2026
// Program: Swap first half and second half of array

public class array_swap_halves {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int mid = arr.length / 2;
        for(int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[mid + i];
            arr[mid + i] = temp;
        }
        System.out.print("After Swap Halves: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

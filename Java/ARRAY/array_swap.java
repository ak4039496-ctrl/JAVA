// Author: Amit Gupta
// Date: 18-09-2026
// Program: Swap two elements in array

public class array_swap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int i = 1, j = 3; // positions to swap
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.print("After Swap: ");
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print first half of array

public class array_first_half {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int mid = arr.length / 2;
        System.out.print("First Half: ");
        for(int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

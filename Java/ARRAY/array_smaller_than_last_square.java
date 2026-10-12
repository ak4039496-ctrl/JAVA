// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than square of last element

public class array_smaller_than_last_square {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 4};
        int square = arr[arr.length - 1] * arr[arr.length - 1];
        System.out.println("Square of last => " + square);
        System.out.print("Smaller than square: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < square) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

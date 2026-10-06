// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than square of first element

public class array_greater_than_first_square {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 30, 40};
        int square = arr[0] * arr[0];
        System.out.println("Square of first element => " + square);
        System.out.print("Greater than square: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > square) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

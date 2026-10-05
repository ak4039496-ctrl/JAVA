// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than first element

public class array_greater_than_first {
    public static void main(String[] args) {
        int[] arr = {20, 15, 30, 40, 10};
        int first = arr[0];
        System.out.print("Greater than first element: ");
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > first) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

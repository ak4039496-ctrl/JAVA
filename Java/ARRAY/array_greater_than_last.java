// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than last element

public class array_greater_than_last {
    public static void main(String[] args) {
        int[] arr = {20, 15, 30, 40, 10};
        int last = arr[arr.length - 1];
        System.out.print("Greater than last element: ");
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > last) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

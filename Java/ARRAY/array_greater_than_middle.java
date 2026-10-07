// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than middle element

public class array_greater_than_middle {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int mid = arr[arr.length / 2];
        System.out.print("Greater than middle element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > mid) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

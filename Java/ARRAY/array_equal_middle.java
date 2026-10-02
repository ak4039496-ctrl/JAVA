// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to middle element

public class array_equal_middle {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int mid = arr[arr.length / 2];
        System.out.print("Equal to middle element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == mid) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to last element

public class array_equal_last {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 10};
        int last = arr[arr.length - 1];
        System.out.print("Equal to last element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == last) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

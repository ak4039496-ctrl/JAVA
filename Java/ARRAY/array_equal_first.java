// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to first element

public class array_equal_first {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40};
        int first = arr[0];
        System.out.print("Equal to first element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == first) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

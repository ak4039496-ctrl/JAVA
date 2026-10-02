// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to second last element

public class array_equal_second_last {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20};
        int secondLast = arr[arr.length - 2];
        System.out.print("Equal to second last element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == secondLast) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

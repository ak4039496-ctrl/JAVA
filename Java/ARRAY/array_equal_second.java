// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to second element

public class array_equal_second {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40};
        int second = arr[1];
        System.out.print("Equal to second element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == second) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

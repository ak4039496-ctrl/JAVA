// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to fourth element

public class array_equal_fourth {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 40};
        int fourth = arr[3];
        System.out.print("Equal to fourth element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == fourth) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

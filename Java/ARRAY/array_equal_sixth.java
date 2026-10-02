// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to sixth element

public class array_equal_sixth {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int sixth = arr[5];
        System.out.print("Equal to sixth element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == sixth) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

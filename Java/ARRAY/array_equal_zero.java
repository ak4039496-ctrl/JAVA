// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to zero

public class array_equal_zero {
    public static void main(String[] args) {
        int[] arr = {0, 5, 10, 0, 15};
        System.out.print("Equal to 0: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to middle index value

public class array_equal_middle_index {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int midIndex = arr.length / 2;
        int midValue = arr[midIndex];
        System.out.print("Equal to middle index value: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == midValue) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

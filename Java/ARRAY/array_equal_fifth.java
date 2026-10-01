// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to fifth element

public class array_equal_fifth {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int fifth = arr[4];
        System.out.print("Equal to fifth element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == fifth) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

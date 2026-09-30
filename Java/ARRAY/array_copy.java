// Author: Amit Gupta
// Date: 18-09-2026
// Program: Copy array elements into another array

public class array_copy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};
        int[] arr2 = new int[arr1.length]; // new array
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i]; // copy elements
        }
        System.out.print("Copied Array: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

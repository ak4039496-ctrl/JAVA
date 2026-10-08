// Author: Amit Gupta
// Date: 19-09-2026
// Program: Merge two arrays

public class array_merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] merged = new int[arr1.length + arr2.length];
        int index = 0;
        for(int i = 0; i < arr1.length; i++) {
            merged[index++] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            merged[index++] = arr2[i];
        }
        System.out.print("Merged Array: ");
        for(int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Find duplicate elements in array

public class array_duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        System.out.println("Duplicate Elements:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

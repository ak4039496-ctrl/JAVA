// Author: Amit Gupta
// Date: 18-09-2026
// Program: Check if array is sorted ascending

public class array_is_sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean sorted = true;
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]) {
                sorted = false;
                break;
            }
        }
        if(sorted) {
            System.out.println("Array is sorted ascending");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}

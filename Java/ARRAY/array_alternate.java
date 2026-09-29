// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print alternate elements of array

public class array_alternate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Alternate Elements: ");
        for(int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

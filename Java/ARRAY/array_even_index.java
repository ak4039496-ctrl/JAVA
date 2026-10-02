// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements at even index

public class array_even_index {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        System.out.print("Even Index Elements: ");
        for(int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

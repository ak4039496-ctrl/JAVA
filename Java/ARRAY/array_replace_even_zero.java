// Author: Amit Gupta
// Date: 19-09-2026
// Program: Replace all even elements with zero

public class array_replace_even_zero {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.print("After Replace: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

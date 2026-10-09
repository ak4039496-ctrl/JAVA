// Author: Amit Gupta
// Date: 19-09-2026
// Program: Replace element at position

public class array_replace {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int pos =2; // index to replace
        arr[pos]= 99; // new value
        System.out.print("After Replace: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Copy array in reverse order

public class array_reverse_copy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reverse Copy: ");
        for(int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than double of first element

public class array_greater_than_double_first {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 50, 60};
        int value = arr[0] * 2;
        System.out.println("Double of first => " + value);
        System.out.print("Greater than double: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > value) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

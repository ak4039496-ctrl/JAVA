// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than double of first element

public class array_smaller_than_double_first {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 5 , 60};
        int value = arr[0] * 2;
        System.out.println("Double of first => " + value);
        System.out.println("Smaller than double: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < value) {
                System.out.print(arr[i] + " "); // 10 ,5
            }
        }
    }
}

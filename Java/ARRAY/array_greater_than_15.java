// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than 15

public class array_greater_than_15 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        System.out.print("Greater than 15: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 15) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

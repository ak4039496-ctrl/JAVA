// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements greater than 10

public class array_greater_than_10 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 8, 20, 3};
        System.out.print("Greater than 10: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 10) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

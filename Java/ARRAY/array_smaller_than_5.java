// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than 5

public class array_smaller_than_5 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 1, 10};
        System.out.print("Smaller than 5: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 5) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

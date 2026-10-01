// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements divisible by 5

public class array_divisible_by_5 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 12, 15, 20, 25};
        System.out.print("Divisible by 5: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

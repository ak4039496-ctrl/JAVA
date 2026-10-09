// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements not divisible by 3

public class array_not_divisible_by_3 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 9, 12, 15};
        System.out.print("Not Divisible by 3: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements equal to 100

public class array_equal_100 {
    public static void main(String[] args) {
        int[] arr = {50, 100, 75, 100, 25};
        System.out.print("Equal to 100: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 100) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

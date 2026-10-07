// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than second element

public class array_greater_than_second {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int second = arr[1];
        System.out.print("Greater than second element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > second) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print elements greater than second last element

public class array_greater_than_second_last {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int secondLast = arr[arr.length - 2];
        System.out.print("Greater than second last element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secondLast) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

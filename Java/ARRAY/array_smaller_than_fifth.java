// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print elements smaller than fifth element

public class array_smaller_than_fifth {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        int fifth = arr[4];
        System.out.print("Smaller than fifth element: ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < fifth) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

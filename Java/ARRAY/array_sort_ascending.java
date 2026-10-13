// Author: Amit Gupta
// Date: 18-09-2026
// Program: Sort array in ascending order

public class array_sort_ascending {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10};
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Ascending: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

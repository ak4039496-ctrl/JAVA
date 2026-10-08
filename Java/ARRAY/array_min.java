// Author: Amit Gupta
// Date: 19-09-2026
// Program: Find minimum element in array

public class array_min {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89};
        int min = arr[0]; // assume first element is min
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i]; // update min
            }
        }
        System.out.println("Minimum => " + min);
    }
}

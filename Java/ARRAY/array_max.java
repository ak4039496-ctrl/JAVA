// Author: Amit Gupta
// Date: 19-09-2026
// Program: Find maximum element in array

public class array_max {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89};
        int max = arr[0]; // assume first element is max
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i]; // update max
            }
        }
        System.out.println("Maximum => " + max);
    }
}

// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print largest and smallest element in array

public class array_min_max {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89};
        int min = arr[0], max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Smallest => " + min);
        System.out.println("Largest => " + max);
    }
}

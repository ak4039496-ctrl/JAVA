// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print positive elements from array

public class array_positive_elements {
    public static void main(String[] args) {
        int[] arr = {-5, 10, -3, 7, 2};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

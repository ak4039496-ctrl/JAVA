// Author: Amit Gupta
// Date: 18-09-2026
// Program: Count negative elements in array

public class array_count_negative {
    public static void main(String[] args) {
        int[] arr = {-5, 10, -3, 7, 2};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Negative Count => " + count);
    }
}

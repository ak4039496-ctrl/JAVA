// Author: Amit Gupta
// Date: 18-09-2026
// Program: Count even elements in array

public class array_count_even {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even Count => " + count);
    }
}

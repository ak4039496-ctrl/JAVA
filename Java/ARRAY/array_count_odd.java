// Author: Amit Gupta
// Date: 18-09-2026
// Program: Count odd elements in array

public class array_count_odd {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd Count => " + count);
    }
}

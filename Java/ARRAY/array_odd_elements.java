// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print odd elements from array

public class array_odd_elements {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

// Author: Amit Gupta
// Date: 18-09-2026
// Program: Print even elements from array

public class array_even_elements {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 11, 14};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

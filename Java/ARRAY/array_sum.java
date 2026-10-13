// Author: Amit Gupta
// Date: 10-09-2026
// Program: Find sum of array elements

public class array_sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // array elements
        int sum = 0; // variable to store sum
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]; // add each element
        }
        System.out.println("Sum => " + sum);
    }
}

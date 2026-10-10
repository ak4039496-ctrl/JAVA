// Author: Amit Gupta
// Date: 18-09-2026
// Program: Find second largest element in array

public class array_second_largest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if(arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        System.out.println("Second Largest => " + second);
    }
}

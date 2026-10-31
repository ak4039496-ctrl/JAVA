// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find second smallest element in array

public class second_smallest_in_array {
    public static void main(String[] args) {
        int arr[] = {10, 25, 5, 40, 15};
        int smallest = arr[0], second = arr[0];
        int i = 1;
        do {
            if (arr[i] < smallest) {
                second = smallest;
                smallest = arr[i];
            } else if (arr[i] < second && arr[i] != smallest) {
                second = arr[i];
            }
            i++;
        } while (i < arr.length);
        System.out.println("Second Smallest => " + second);
    }
}

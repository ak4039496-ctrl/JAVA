// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find second largest element in array

public class second_largest_in_array {
    public static void main(String[] args) {
        int arr[] = {10, 25, 40, 15, 30};
        int largest = arr[0], second = arr[0];
        int i = 1;
        do {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
            i++;
        } while (i < arr.length);
        System.out.println("Second Largest => " + second);
    }
}

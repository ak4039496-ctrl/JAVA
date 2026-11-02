// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of array elements

public class sum_of_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; //  Input array
        int i = 0; // Initialize index
        int sum = 0; // Initialize sum
        do {
            sum += arr[i]; //  Add element to sum
            i++; // Increment index
        } while (i < arr.length); // Condition check
        System.out.println("Sum => " + sum); // Print result
    }
}

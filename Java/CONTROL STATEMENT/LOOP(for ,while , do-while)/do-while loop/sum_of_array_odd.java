// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of odd elements in array

public class sum_of_array_odd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6}; // Input array
        int i = 0; //  Initialize index
        int sum = 0; // Initialize sum

        // Start do-while loop
        do {
            if (arr[i] % 2 != 0) { // Check if element is odd
                sum += arr[i]; // Add odd element to sum
            }
            i++; // Increment index
        } while (i < arr.length); //  Condition check

        System.out.println("Sum of odd => " + sum); // Print result
    }
}

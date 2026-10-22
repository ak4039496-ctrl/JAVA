// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find largest element in array

public class largest_in_array {
    public static void main(String[] args) {
        int arr[] = {10, 25, 5, 40, 15}; //  Input array
        int i = 1; //  Start from second element
        int max = arr[0]; // Assume first is max
        do {
            if (arr[i] > max) { // Compare
                max = arr[i]; //  Update max
            }
            i++; //  Increment index
        } while (i < arr.length); // Condition check
        System.out.println("Largest => " + max); //  Print result
    }
}

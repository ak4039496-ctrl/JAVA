// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find smallest element in array

public class smallest_in_array {
    public static void main(String[] args) {
        int arr[] = {10, 25, 5, 40, 15}; //  Input array
        int i = 1; // Start from second element
        int min = arr[0]; //  Assume first is min
        do {
            if (arr[i] < min) { //  Compare
                min = arr[i]; //  Update min
            }
            i++; //  Increment index
        } while (i < arr.length); //  Condition check
        System.out.println("Smallest => " + min); //Print result
    }
}

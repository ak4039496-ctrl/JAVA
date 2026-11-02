// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of even elements in array

public class sum_of_array_even {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int i = 0, sum = 0;
        do {
            if (arr[i] % 2 == 0) sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Sum of even => " + sum);
    }
}

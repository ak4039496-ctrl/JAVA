// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of squares of first N numbers

public class sum_of_series_square_n {
    public static void main(String[] args) {
        int n = 10; //  Input N
        int i = 1, sum = 0; // Initialize
        do {
            sum += i * i; //  Add square
            i++; // Increment
        } while (i <= n); // Condition check
        System.out.println("Sum of squares => " + sum);
    }
}

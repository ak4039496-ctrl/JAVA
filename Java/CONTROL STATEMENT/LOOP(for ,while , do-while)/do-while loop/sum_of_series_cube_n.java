// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of cubes of first N numbers

public class sum_of_series_cube_n {
    public static void main(String[] args) {
        int n = 10; //  Input N
        int i = 1, sum = 0; //  Initialize
        do {
            sum += i * i * i; // Add cube
            i++; // Increment
        } while (i <= n); // Condition check
        System.out.println("Sum of cubes => " + sum);
    }
}

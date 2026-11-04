// Author: Amit Gupta
// Date: 06-10-2026
// Program: Sum of first N odd numbers

public class sum_of_series_odd {
    public static void main(String[] args) {
        int n = 20; //  Input N
        int i = 1, sum = 0; //Initialize
        do {
            sum += i; //  Add odd number
            i += 2; // Next odd
        } while (i <= n * 2 - 1); //  Condition check
        System.out.println("Sum of odd => " + sum);
    }
}

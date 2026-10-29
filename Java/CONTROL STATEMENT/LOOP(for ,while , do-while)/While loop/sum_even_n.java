// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of even numbers up to n 

public class sum_even_n {
    public static void main(String[] args) {
        int n = 20; // limit
        int i = 2; // start with first even number
        int sum = 0; // variable to store sum

        while (i <= n) {
            sum += i; // add current even number
            i += 2; // move to next even number
        }

        System.out.println("Sum of even numbers up to " + n + " => " + sum);
    }
}

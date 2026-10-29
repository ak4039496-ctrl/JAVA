// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of even numbers from 1 to 20 

public class sum_even_1_to_20 {
    public static void main(String[] args) {
        int i = 2; // start with first even number
        int sum = 0; // variable to store sum

        while (i <= 20) {
            sum += i; // add current even number
            i += 2; // move to next even number
        }

        System.out.println("Sum of even numbers => " + sum);
    }
}

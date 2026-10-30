// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of odd numbers from 1 to 20

public class sum_odd_1_to_20 {
    public static void main(String[] args) {
        int i = 1; // start with first odd number
        int sum = 0; // variable to store sum

        while (i <= 20) {
            sum += i; // add current odd number
            i += 2; // move to next odd number
        }

        System.out.println("Sum of odd numbers => " + sum);
    }
}

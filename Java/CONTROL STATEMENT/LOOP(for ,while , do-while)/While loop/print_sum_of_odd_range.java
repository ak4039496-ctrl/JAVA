// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of odd numbers between 50 and 100 
public class print_sum_of_odd_range {
    public static void main(String[] args) {
        int i = 50; // start with 50
        int sum = 0;

        // loop until i <= 100
        while (i <= 100) {
            if (i % 2 != 0) {
                sum += i; // add odd number
            }
            i++;
        }

        System.out.println("Sum of odd numbers between 50 and 100 => " + sum);
    }
}

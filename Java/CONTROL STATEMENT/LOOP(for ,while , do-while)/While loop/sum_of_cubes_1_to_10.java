// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of cubes of numbers from 1 to 10 using while loop

public class sum_of_cubes_1_to_10 {
    public static void main(String[] args) {
        int i = 1; // start with 1
        int sum = 0; // variable to store sum

        while (i <= 10) {
            sum += (i * i * i); // add cube of current number
            i++; // move to next number
        }

        System.out.println("Sum of cubes => " + sum);
    }
}

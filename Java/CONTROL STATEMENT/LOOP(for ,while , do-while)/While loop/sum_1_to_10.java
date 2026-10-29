// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of numbers from 1 to 10 
public class sum_1_to_10 {
    public static void main(String[] args) {
        int i = 1; // counter starts at 1
        int sum = 0; // variable to store sum

        // loop until i <= 10
        while (i <= 10) {
            sum += i; // add current number to sum
            i++; // move to next number
        }

        System.out.println("Sum => " + sum); // print final sum
    }
}

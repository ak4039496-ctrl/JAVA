// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of multiples of 7 up to 70 

public class sum_multiples_of_7 {
    public static void main(String[] args) {
        int i = 7; // start with first multiple
        int sum = 0; // variable to store sum

        while (i <= 70) {
            sum += i; // add current multiple
            i += 7; // move to next multiple
        }

        System.out.println("Sum of multiples of 7 => " + sum);
    }
}

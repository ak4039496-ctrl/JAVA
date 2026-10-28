// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print squares of numbers from 1 to 10 using while loop

public class square_numbers_1_to_10 {
    public static void main(String[] args) {
        int i = 1; // start with 1

        while (i <= 10) {
            System.out.println("Square of " + i + " => " + (i * i));
            i++; // move to next number
        }
    }
}

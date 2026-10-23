// Author: Amit Gupta
// Date: 05-06-2026
// Program: Print cubes of numbers from 1 to 10 using while loop

public class cube_numbers_1_to_10 {
    public static void main(String[] args) {
        int i = 1; // start with 1

        while (i <= 10) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
            i++; // move to next number
        }
    }
}

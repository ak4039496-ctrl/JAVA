// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print multiplication table of 5 

public class multiplication_table_5 {
    public static void main(String[] args) {
        int i = 1; // start with 1

        // loop until i <= 10
        while (i <= 10) {
            System.out.println("5 x " + i + " = " + (5 * i)); // print table line
            i++; // move to next multiplier
        }
    }
}

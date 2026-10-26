// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print tables of numbers 2 to 3 in reverse order 

public class print_reverse_table_series {
    public static void main(String[] args) {
        int num = 2; // start with 2

        while (num <= 3) {
            int i = 10; // start with 10
            System.out.println("Reverse Table of " + num);

            while (i >= 1) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i--; // move backward
            }

            num++; // move to next table
        }
    }
}

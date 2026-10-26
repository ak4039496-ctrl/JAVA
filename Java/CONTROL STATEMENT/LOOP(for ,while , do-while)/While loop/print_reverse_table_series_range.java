// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print tables of numbers 7 to 8 in reverse order

public class print_reverse_table_series_range {
    public static void main(String[] args) {
        int num = 7; // start with 7

        while (num < 8) {
            int i = 10; // start with 10
            System.out.println("Reverse Table of " + num);

            while (i >= 1) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i--; // move backward
            }

            num++;
        }
    }
}

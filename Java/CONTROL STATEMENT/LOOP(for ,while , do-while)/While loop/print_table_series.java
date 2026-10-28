// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print tables of numbers 2 to 4

public class print_table_series {
    public static void main(String[] args) {
        int num = 2; // start number

        // loop until num <= 4
        while (num <= 4) {
            int i = 1; // multiplier
            System.out.println("Table of " + num);

            while (i <= 10) {
                System.out.println(num + " x " + i + " = " + (num * i));
                i++;
            }

            num++; // move to next table
        }
    }
}

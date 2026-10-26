// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print multiplication table of 6 in reverse order 

public class print_reverse_table {
    public static void main(String[] args) {
        int num = 6; // table number
        int i = 10; // start with 10

        while (i >= 1) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i--;
        }
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print odd numbers from 19 to 1 in reverse 

public class print_reverse_odd_numbers {
    public static void main(String[] args) {
        int i = 19; // start with 19

        while (i >= 1) {
            System.out.println(i); // print current odd number
            i -= 2; // move backward by 2
        }
    }
}

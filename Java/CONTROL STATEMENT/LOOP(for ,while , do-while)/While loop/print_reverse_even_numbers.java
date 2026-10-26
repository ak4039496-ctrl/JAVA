// Author: Amit Gupta
// Date: 15-09-2026
// Program: Print even numbers from 20 to 2 in reverse 

public class print_reverse_even_numbers {
    public static void main(String[] args) {
        int i = 20; // start with 20

        while (i >= 2) {
            System.out.println(i); // print current even number
            i -= 2; // move backward by 2
        }
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print even numbers from 1 to 20 

public class print_even_1_to_20 {
    public static void main(String[] args) {
        int i = 2; // start with first even number

        // loop until i <= 20
        while (i <= 20) {
            System.out.println(i); // print current even number
            i += 2; // jump to next even number
        }
    }
}

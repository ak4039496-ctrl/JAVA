// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if a number is even or odd 

public class check_even_or_odd {
    public static void main(String[] args) {
        int num = 17; // number to check
        int i = num; // copy of number

        while (i == num) { // single check loop
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
            break; // exit loop
        }
    }
}

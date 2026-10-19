// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Buzz

public class buzz_number_any {
    public static void main(String[] args) {
        int num = 77; // Step 1: Input number
        if (num % 10 == 7 || num % 7 == 0) // Step 2: Condition
            System.out.println(num + " is Buzz");
        else
            System.out.println(num + " is Not Buzz");
    }
}

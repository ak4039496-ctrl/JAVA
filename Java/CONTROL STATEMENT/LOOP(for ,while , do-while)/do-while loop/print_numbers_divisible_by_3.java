// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print numbers divisible by 3 up to 30

public class print_numbers_divisible_by_3 {
    public static void main(String[] args) {
        int i = 3; //  Start from 3
        do {
            System.out.print(i + " "); // Print number
            i += 3; // Next multiple
        } while (i <= 30); //  Condition check
    }
}

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print numbers divisible by 5 up to 50

public class print_numbers_divisible_by_5 {
    public static void main(String[] args) {
        int i = 5; //  Start from 5
        do {
            System.out.print(i + " "); // Print number
            i += 5; //  Next multiple
        } while (i <= 50); // Condition check
    }
}

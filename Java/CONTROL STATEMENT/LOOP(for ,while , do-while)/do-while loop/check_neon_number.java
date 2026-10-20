// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if number 9 is Neon 

public class check_neon_number {
    public static void main(String[] args) {
        int num = 9; // number to check
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is Neon Number");
        } else {
            System.out.println(num + " is Not Neon Number");
        }
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if number 28 is perfect 

public class check_perfect_number {
    public static void main(String[] args) {
        int num = 28; // number to check
        int i = 1; // start with 1
        int sum = 0; // sum of divisors

        while (i < num) {
            if (num % i == 0) {
                sum += i; // add divisor
            }
            i++;
        }

        if (sum == num) {
            System.out.println(num + " is Perfect");
        } else {
            System.out.println(num + " is Not Perfect");
        }
    }
}

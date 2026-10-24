// Author: Amit Gupta
// Date: 15-09-2026
// Program: Print perfect numbers between 1 and 500 

public class print_perfect_numbers_series {
    public static void main(String[] args) {
        int num = 1; // start number

        while (num <= 500) {
            int i = 1;
            int sum = 0;

            while (i < num) {
                if (num % i == 0) {
                    sum += i; // add divisor
                }
                i++;
            }

            if (sum == num && num != 0) {
                System.out.println(num); // print perfect number
            }
            num++;
        }
    }
}

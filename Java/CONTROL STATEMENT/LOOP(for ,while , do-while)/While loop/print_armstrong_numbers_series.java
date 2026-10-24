// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print Armstrong numbers between 1 and 1000

public class print_armstrong_numbers_series {
    public static void main(String[] args) {
        int num = 1; // start number

        while (num <= 1000) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num); // print Armstrong number
            }
            num++;
        }
    }
}

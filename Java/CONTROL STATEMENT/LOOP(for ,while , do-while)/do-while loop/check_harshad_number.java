// Author: Amit Gupta
// Date: 05-10-2026
// Program: Check if number 18 is Harshad

public class check_harshad_number {
    public static void main(String[] args) {
        int num = 18; // number to check
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is Harshad Number");
        } else {
            System.out.println(num + " is Not Harshad Number");
        }
    }
}

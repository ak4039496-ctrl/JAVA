// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if number 145 is Strong 

public class check_strong_number {
    public static void main(String[] args) {
        int num = 145; // number to check
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            int i = 1;

            while (i <= digit) {
                fact *= i;
                i++;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is Strong Number");
        } else {
            System.out.println(num + " is Not Strong Number");
        }
    }
}

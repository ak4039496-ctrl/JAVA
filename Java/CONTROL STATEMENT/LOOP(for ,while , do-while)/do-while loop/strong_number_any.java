// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Strong

public class strong_number_any {
    public static void main(String[] args) {
        int num = 145; //  Input number
        int temp = num, sum = 0; //Copy
        do {
            int digit = temp % 10; //Extract digit
            int fact = 1, i = 1; // Factorial
            do {
                fact *= i;
                i++;
            } while (i <= digit);
            sum += fact; //Add factorial
            temp /= 10; // Remove digit
        } while (temp > 0);
        if (sum == num) System.out.println(num + " is Strong");
        else System.out.println(num + " is Not Strong");
    }
}

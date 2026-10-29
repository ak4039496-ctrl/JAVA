// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reduce number to single digit by summing digits repeatedly using while loop

public class sum_digits_until_single {
    public static void main(String[] args) {
        int num = 9876;

        while (num > 9) {
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            num = sum; // update number
        }

        System.out.println("Single digit result => " + num);
    }
}

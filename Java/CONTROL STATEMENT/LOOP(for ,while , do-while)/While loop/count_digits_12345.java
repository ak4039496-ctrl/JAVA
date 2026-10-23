// Author: Amit Gupta
// Date: 05-09-2026
// Program: Count digits in number 12345 using while loop

public class count_digits_12345 {
    public static void main(String[] args) {
        int num = 12345; // number to process
        int count = 0; // variable to store count

        while (num > 0) {
            count++; // increase count
            num /= 10; // remove last digit
        }

        System.out.println("Number of digits => " + count);
    }
}

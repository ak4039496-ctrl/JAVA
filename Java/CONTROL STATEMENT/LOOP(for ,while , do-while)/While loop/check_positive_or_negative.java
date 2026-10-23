// Author: Amit Gupta
// Date: 25-09-2026
// Program: Check if a number is positive or negative 

public class check_positive_or_negative {
    public static void main(String[] args) {
        int num = -25; // number to check
        int i = num;

        while (i == num) {
            if (num > 0) {
                System.out.println(num + " is Positive");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
            break;
        }
    }
}

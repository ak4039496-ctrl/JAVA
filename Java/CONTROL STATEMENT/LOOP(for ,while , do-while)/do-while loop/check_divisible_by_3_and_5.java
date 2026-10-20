// Author: Amit Gupta
// Date: 15-09-2026
// Program: Check if a number is divisible by 3 and 5 

public class check_divisible_by_3_and_5 {
    public static void main(String[] args) {
        int num = 30; // number to check
        int i = num;

        while (i == num) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num + " is divisible by 3 and 5");
            } else {
                System.out.println(num + " is not divisible by 3 and 5");
            }
            break;
        }
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if number 25 is Automorphic using while loop

public class check_automorphic_number {
    public static void main(String[] args) {
        int num = 25; // number to check
        int square = num * num; // square of number
        int temp = num;
        boolean isAuto = true;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAuto = false;
                break;
            }
            temp /= 10;
            square /= 10;
        }

        if (isAuto) {
            System.out.println(num + " is Automorphic Number");
        } else {
            System.out.println(num + " is Not Automorphic Number");
        }
    }
}

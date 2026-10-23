// Author: Amit Gupta
// Date: 15-09-2026
// Program: Check if a number is a perfect square

public class check_perfect_square {
    public static void main(String[] args) {
        int num = 49; // number to check
        int i = 1;
        boolean isSquare = false;

        while (i * i <= num) {
            if (i * i == num) {
                isSquare = true;
                break;
            }
            i++;
        }

        if (isSquare) {
            System.out.println(num + " is Perfect Square");
        } else {
            System.out.println(num + " is Not Perfect Square");
        }
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if a number is a perfect cube using while loop

public class check_perfect_cube {
    public static void main(String[] args) {
        int num = 27; // number to check
        int i = 1;
        boolean isCube = false;

        while (i * i * i <= num) {
            if (i * i * i == num) {
                isCube = true;
                break;
            }
            i++;
        }

        if (isCube) {
            System.out.println(num + " is Perfect Cube");
        } else {
            System.out.println(num + " is Not Perfect Cube");
        }
    }
}

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is a perfect square

public class perfect_square_check {
    public static void main(String[] args) {
        int num = 49; // Step 1: Input number
        int i = 1; // Step 2: Start
        boolean square = false; // Step 3: Assume false
        do {
            if (i * i == num) { // Step 4: Check square
                square = true;
                break;
            }
            i++;
        } while (i <= num / 2);
        if (square) System.out.println(num + " is Perfect Square");
        else System.out.println(num + " is Not Perfect Square");
    }
}

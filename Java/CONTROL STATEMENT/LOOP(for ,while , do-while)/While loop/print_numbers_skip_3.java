// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print numbers from 1 to 20 skipping multiples of 3 

public class print_numbers_skip_3 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

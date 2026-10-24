// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print numbers divisible by 4 up to 40 
public class print_numbers_divisible_by_4 {
    public static void main(String[] args) {
        int i = 4; // start with first multiple

        while (i <= 40) {
            System.out.println(i); // print number
            i += 4; // move to next multiple
        }
    }
}

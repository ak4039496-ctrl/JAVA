// Author: Amit Gupta
// Date: 15-09-2026
// Program: Print multiples of 3 up to 30 

public class print_multiples_of_3 {
    public static void main(String[] args) {
        int i = 3; // start with first multiple

        while (i <= 30) {
            System.out.println(i); // print current multiple
            i += 3; // move to next multiple
        }
    }
}

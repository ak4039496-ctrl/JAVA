// Author: Amit Gupta
// Date: 29-09-2026
// Program: Print numbers 1 to 20 but skip multiples of 3

public class skip_multiples_of_3 {
    public static void main(String[] args) {
        
        // loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            
            // if number is divisible by 3, skip
            if (i % 3 == 0) {
                continue;
            }
            
            // print number
            System.out.println(i);
        }
    }
}

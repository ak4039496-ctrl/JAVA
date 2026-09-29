// Author: Amit Gupta
// Date: 29-09-2026
// Program: Print odd numbers up to 15 but skip 9

public class odd_numbers_continue {
    public static void main(String[] args) {
        
        // loop from 1 to 15
        for (int i = 1; i <= 15; i++) {
            
            // check if number is odd
            if (i % 2 != 0) {
                
                // skip number 9
                if (i == 9) {
                    continue;
                }
                
                // print odd number
                System.out.println(i);
            }
        }
    }
}

// Author: Amit Gupta
// Date: 29-09-2026
// Program: Print numbers 1 to 10 but skip 5 using continue

public class print_1_to_10_continue {
    public static void main(String[] args) {
        
        // loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            
            // if i is 5, skip printing
            if (i == 5) {
                continue; // jump to next iteration
            }
            
            // print the number
            System.out.println(i);
        }
    }
}

// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip even numbers

public class continue_on_even {
    public static void main(String[] args) {
        
        // loop from 1 to 15
        for (int i = 1; i <= 15; i++) {
            
            // skip even numbers
            if (i % 2 == 0) {
                continue;
            }
            
            // print odd number
            System.out.println(i);
        }
    }
}

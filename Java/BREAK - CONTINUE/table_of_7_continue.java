// Author: Amit Gupta
// Date: 29-09-2026
// Program: Print table of 7 but skip 7 x 5

public class table_of_7_continue {
    public static void main(String[] args) {
        
        // loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            
            // skip when multiplier is 5
            if (i == 5) {
                continue;
            }
            
            // print table value
            System.out.println("7 x " + i + " => " + (7 * i));
        }
    }
}

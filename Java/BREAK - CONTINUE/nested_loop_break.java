// Author: Amit Gupta
// Date: 09-09-2026
// Program: Nested loop with break when j = 3

public class nested_loop_break {
    public static void main(String[] args) {
        
        // outer loop from 1 to 3
        for (int i = 1; i <= 3; i++) {
            
            // inner loop from 1 to 5
            for (int j = 1; j <= 5; j++) {
                
                // break inner loop when j = 3
                if (j == 3) {
                    break;
                }
                
                // print i and j
                System.out.println("i => " + i + ", j => " + j);
            }
        }
    }
}

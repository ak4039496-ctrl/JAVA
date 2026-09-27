// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip multiples of 5

public class continue_on_multiple_of_5 {
    public static void main(String[] args) {
        
        // loop from 1 to 30
        for (int i = 1; i <= 30; i++) {
            
            // skip multiples of 5
            if (i % 5 == 0) {
                continue;
            }
            
            // print number
            System.out.println(i);
        }
    }
}

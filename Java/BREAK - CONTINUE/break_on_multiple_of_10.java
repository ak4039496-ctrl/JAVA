// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when number is multiple of 10

public class break_on_multiple_of_10 {
    public static void main(String[] args) {
        
        // loop from 1 to 50
        for (int i = 1; i <= 50; i++) {
            
            // stop when number is multiple of 10
            if (i % 10 == 0) {
                break;
            }
            
            // print number
            System.out.println(i);
        }
    }
}

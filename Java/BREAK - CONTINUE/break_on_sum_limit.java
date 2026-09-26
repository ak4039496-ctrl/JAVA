// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when sum exceeds 50

public class break_on_sum_limit {
    public static void main(String[] args) {
        
        int sum = 0;
        
        // loop from 1 to 20
        for (int i = 1; i <= 20; i++) {
            
            sum += i; // add number
            
            // stop when sum > 50
            if (sum > 50) {
                break;
            }
            
            // print current sum
            System.out.println("Sum = " + sum);
        }
    }
}

// Author: Amit Gupta
// Date: 20-09-2026
// Program: Find sum of even and odd numbers separately

public class sum_even_odd {
    public static void main(String[] args) {
        
        int n = 10; // range
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                int evenSum = 0, oddSum = 0;
                
                // Loop from 1 to n
                for(int i = 1; i <= n; i++) {
                    if(i % 2 == 0) {
                        evenSum += i; // add even
                    } else {
                        oddSum += i;  // add odd
                    }
                }
                
                System.out.println("Sum of Even => " + evenSum);
                System.out.println("Sum of Odd => " + oddSum);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

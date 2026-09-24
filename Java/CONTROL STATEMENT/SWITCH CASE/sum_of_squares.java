// Author: Amit Gupta
// Date: 20-09-2026
// Program: Sum of squares of first n numbers

public class sum_of_squares {
    public static void main(String[] args) {
        
        int n = 10; // range
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                int sum = 0;
                
                // Loop to add squares
                for(int i = 1; i <= n; i++) {
                    sum += i * i;
                }
                
                System.out.println("Sum of squares => " + sum);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

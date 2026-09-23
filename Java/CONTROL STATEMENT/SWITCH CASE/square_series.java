// Author: Amit Gupta
// Date:20-09-2026
// Program: Print squares of first n numbers

public class square_series {
    public static void main(String[] args) {
        
        int n = 5; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                // Loop to print squares
                for(int i = 1; i <= n; i++) {
                    System.out.println("Square of " + i + " => " + (i * i));
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

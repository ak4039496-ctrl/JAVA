// Author: Amit Gupta
// Date: 17-09-2026
// Program: Print Fibonacci series

public class fibonacci_series {
    public static void main(String[] args) {
        
        int n = 10; 
        int choice = 1;
        
        switch(choice) {
            case 1:
                int a = 0, b = 1;
                System.out.print("Fibonacci: " + a + " " + b);
                for(int i = 2; i < n; i++) {
                    int c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

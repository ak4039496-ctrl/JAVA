// Author: Amit Gupta
// Date: 20-09-2026
// Program: Sum of first n even numbers

public class sum_even_series {
    public static void main(String[] args) {
        
        int n = 10; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0;
                // Loop to add even numbers
                for(int i = 2; i <= n; i += 2) {
                    sum += i;
                }
                System.out.println("Sum of first " + n/2 + " even numbers => " + sum);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

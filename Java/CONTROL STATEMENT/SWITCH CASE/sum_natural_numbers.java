// Author: Amit Gupta
// Date: 20-09-2026
// Program: Sum of first n natural numbers

public class sum_natural_numbers {
    public static void main(String[] args) {
        
        int n = 10; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0;
                // Loop to add numbers
                for(int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Sum of first " + n + " numbers => " + sum);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

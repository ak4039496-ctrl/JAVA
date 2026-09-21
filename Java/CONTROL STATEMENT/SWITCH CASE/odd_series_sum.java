// Author: Amit Gupta
// Date: 19-09-2026
// Program: Sum of first n odd numbers

public class odd_series_sum {
    public static void main(String[] args) {
        
        int n = 10; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0;
                // Loop to add odd numbers
                for(int i = 1; i <= n; i += 2) {
                    sum += i;
                }
                System.out.println("Sum of odd numbers => " + sum);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

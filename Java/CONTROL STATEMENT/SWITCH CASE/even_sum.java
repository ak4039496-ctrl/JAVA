// Author: Amit Gupta
// Date: 17-09-2026
// Program: Sum of even numbers up to n

public class even_sum {
    public static void main(String[] args) {
        
        int n = 10; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0;
                for(int i = 2; i <= n; i += 2) {
                    sum += i;
                }
                System.out.println("Sum of even numbers => " + sum);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

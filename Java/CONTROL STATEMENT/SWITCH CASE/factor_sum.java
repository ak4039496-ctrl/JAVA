// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find sum of factors of a number

public class factor_sum {
    public static void main(String[] args) {
        
        int num = 12; 
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0;
                // Loop to find factors
                for(int i = 1; i <= num; i++) {
                    if(num % i == 0) {
                        sum += i;
                    }
                }
                System.out.println("Sum of factors => " + sum);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

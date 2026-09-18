// Author: Amit Gupta
// Date: 17-09-2026
// Program: Find factorial using switch-case

public class factorial_number {
    public static void main(String[] args) {
        
        int num = 5; 
        int choice = 1; // 1 means calculate factorial
        
        switch(choice) {
            case 1:
                int fact = 1;
                for(int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + num + " => " + fact);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

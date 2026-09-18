// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find GCD of two numbers

public class gcd_of_two {
    public static void main(String[] args) {
        
        int a = 36, b = 60; // numbers
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                int gcd = 1;
                
                // Loop from 1 to min(a,b)
                for(int i = 1; i <= a && i <= b; i++) {
                    if(a % i == 0 && b % i == 0) {
                        gcd = i;
                    }
                }
                
                System.out.println("GCD => " + gcd);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

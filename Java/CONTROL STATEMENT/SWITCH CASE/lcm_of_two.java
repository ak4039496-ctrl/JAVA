// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find LCM of two numbers

public class lcm_of_two {
    public static void main(String[] args) {
        
        // Step 1: Define two numbers
        int a = 12, b = 18;
        
        // Step 2: Choice for switch-case
        int choice = 1;
        
        // Step 3: Switch-case starts
        switch(choice) {
            
            case 1:
                // Store larger number
                int max = (a > b) ? a : b;
                
                // Loop until divisible by both
                while(true) {
                    if(max % a == 0 && max % b == 0) {
                        System.out.println("LCM => " + max);
                        break;
                    }
                    max++;
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

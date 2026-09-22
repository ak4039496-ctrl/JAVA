// Author: Amit Gupta
// Date: 19-09-2026
// Program: Check if a number is Perfect Number

public class perfect_number {
    public static void main(String[] args) {
        
        int num = 28; // number
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                int sum = 0;
                
                // Loop to find divisors
                for(int i = 1; i < num; i++) {
                    if(num % i == 0) {
                        sum += i; // add divisor
                    }
                }
                
                // Compare sum with number
                if(sum == num) {
                    System.out.println(num + " is Perfect Number");
                } else {
                    System.out.println(num + " is Not Perfect Number");
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

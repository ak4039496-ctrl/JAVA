// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Strong Number

public class strong_number {
    public static void main(String[] args) {
        
        int num = 145; // number
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                int sum = 0, temp = num;
                
                // Loop to calculate factorial of digits
                while(temp > 0) {
                    int digit = temp % 10;
                    
                    // factorial of digit
                    int fact = 1;
                    for(int i = 1; i <= digit; i++) {
                        fact *= i;
                    }
                    
                    sum += fact;
                    temp /= 10;
                }
                
                // Compare sum with number
                if(sum == num) {
                    System.out.println(num + " is Strong Number");
                } else {
                    System.out.println(num + " is Not Strong Number");
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

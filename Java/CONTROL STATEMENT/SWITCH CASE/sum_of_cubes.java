// Author: Amit Gupta
// Date: 20-09-2026
// Program: Sum of cubes of first n numbers

public class sum_of_cubes {
    public static void main(String[] args) {
        
        int n = 5; // range
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                int sum = 0;
                
                // Loop to add cubes
                for(int i = 1; i <= n; i++) {
                    sum += i * i * i;
                }
                
                System.out.println("Sum of cubes => " + sum);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

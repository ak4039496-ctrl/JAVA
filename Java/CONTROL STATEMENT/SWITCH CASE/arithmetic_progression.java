// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print Arithmetic Progression series

public class arithmetic_progression {
    public static void main(String[] args) {
        
        int a = 2;  // first term
        int d = 3;  // common difference
        int n = 10; // number of terms
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                // Loop to print AP series
                for(int i = 0; i < n; i++) {
                    int term = a + i * d;
                    System.out.print(term + " ");
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

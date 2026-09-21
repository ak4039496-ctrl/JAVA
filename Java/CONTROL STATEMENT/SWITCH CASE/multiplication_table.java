// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print multiplication table of a number

public class multiplication_table {
    public static void main(String[] args) {
        
        int num = 5; // number
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                // Loop to print table
                for(int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

// Author: Amit Gupta
// Date: 16-09-2026
// Program: Find largest of two numbers

public class largest_of_two {
    public static void main(String[] args) {
        
        int a = 15, b = 25; // numbers
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                if(a > b) {
                    System.out.println("Largest => " + a);
                } else {
                    System.out.println("Largest => " + b);
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

// Author: Amit Gupta
// Date: 16-09-2026
// Program: Find cube of a number

public class cube_number {
    public static void main(String[] args) {
        
        int num = 4; 
        int choice = 1; 
        
        switch(choice) {
            case 1:
                // Multiply number three times
                System.out.println("Cube => " + (num * num * num));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

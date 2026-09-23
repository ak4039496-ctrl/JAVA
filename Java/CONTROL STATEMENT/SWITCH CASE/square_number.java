// Author: Amit Gupta
// Date: 20-09-2026
// Program: Find square of a number

public class square_number {
    public static void main(String[] args) {
        
        int num = 6; // number
        int choice = 1; // 1 means square
        
        switch(choice) {
            case 1:
                // Multiply number by itself
                System.out.println("Square => " + (num * num));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

// Author: Amit Gupta
// Date: 20-09-2026
// Program: Print square and cube of a number

public class square_cube {
    public static void main(String[] args) {
        
        int num = 7; // number
        int choice = 2; // 1 = square, 2 = cube
        
        switch(choice) {
            
            case 1:
                System.out.println("Square => " + (num * num));
                break;
                
            case 2:
                System.out.println("Cube => " + (num * num * num));
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

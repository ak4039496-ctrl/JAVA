// Author: Amit Gupta
// Date: 16-09-2026
// Program: Print shape name

public class basic_shapes {
    public static void main(String[] args) {
        
        int choice = 3;
        
        switch(choice) {
            case 1: System.out.println("Circle"); break;
            case 2: System.out.println("Square"); break;
            case 3: System.out.println("Triangle"); break;
            case 4: System.out.println("Rectangle"); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

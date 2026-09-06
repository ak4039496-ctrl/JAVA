// Author: Amit Gupta
// Date: 06-09-2026
// Program: Arithmetic menu using switch-case

public class arithmetic_menu {
    public static void main(String[] args) {
        
        int a = 12, b = 3;
        int choice = 2; // Example: 2 means subtraction
        
        switch(choice) {
            case 1: System.out.println("Addition=> " + (a + b)); break;
            case 2: System.out.println("Subtraction=> " + (a - b)); break;
            case 3: System.out.println("Multiplication=> " + (a * b)); break;
            case 4: System.out.println("Division=> " + (a / b)); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

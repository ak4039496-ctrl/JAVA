// Author: Amit Gupta
// Date: 20-09-2026
// Program: Calculate area of shapes

public class shape_area_menu {
    public static void main(String[] args) {
        
        int choice = 1; // Example: 1 means square
        int side = 5, radius = 3, length = 4, breadth = 6;
        
        switch(choice) {
            case 1: System.out.println("Area of Square: " + (side * side)); break;
            case 2: System.out.println("Area of Rectangle: " + (length * breadth)); break;
            case 3: System.out.println("Area of Circle: " + (3.14 * radius * radius)); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

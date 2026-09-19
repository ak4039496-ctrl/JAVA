// Author: Amit Gupta
// Date: 18-09-2026
// Program: Library menu

public class library_menu {
    public static void main(String[] args) {
        
        int choice = 3;
        
        switch(choice) {
            case 1: System.out.println("Issue Book"); break;
            case 2: System.out.println("Return Book"); break;
            case 3: System.out.println("Search Book"); break;
            case 4: System.out.println("Exit"); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

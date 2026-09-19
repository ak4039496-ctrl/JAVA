// Author: Amit Gupta
// Date: 16-09-2026
// Program: Hotel food menu

public class hotel_menu {
    public static void main(String[] args) {
        
        int choice = 2; 
        
        switch(choice) {
            case 1: System.out.println("Burger -> Rs.50"); break;
            case 2: System.out.println("Pizza -> Rs.100"); break;
            case 3: System.out.println("Sandwich -> Rs.40"); break;
            case 4: System.out.println("Coffee -> Rs.30"); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

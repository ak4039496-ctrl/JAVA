// Author: Amit Gupta
// Date: 16-09-2026
// Program: Bank menu

public class bank_menu {
    public static void main(String[] args) {
        
        int choice = 1;
        
        switch(choice) {
            case 1: System.out.println("Open Account"); break;
            case 2: System.out.println("Deposit Money"); break;
            case 3: System.out.println("Withdraw Money"); break;
            case 4: System.out.println("Check Balance"); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

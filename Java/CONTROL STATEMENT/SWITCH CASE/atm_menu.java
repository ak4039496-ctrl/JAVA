// Author: Amit Gupta
// Date: 06-09-2026
// Program: ATM menu simulation

public class atm_menu {
    public static void main(String[] args) {
        
        int choice = 3; // Example: 3 means check balance
        
        switch(choice) {
            case 1: System.out.println("Deposit Money"); break;
            case 2: System.out.println("Withdraw Money"); break;
            case 3: System.out.println("Check Balance"); break;
            case 4: System.out.println("Exit"); break;
            default: System.out.println("Invalid choice!");
        }
    }
}

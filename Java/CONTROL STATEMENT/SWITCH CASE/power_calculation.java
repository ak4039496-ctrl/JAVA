// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate power (a^b)

public class power_calculation {
    public static void main(String[] args) {
        
        int a = 2, b = 5;
        int choice = 1;
        
        switch(choice) {
            case 1:
                int result = 1;
                for(int i = 1; i <= b; i++) {
                    result *= a;
                }
                System.out.println(a + "^" + b + " => " + result);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

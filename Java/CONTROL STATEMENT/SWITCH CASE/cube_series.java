// Author: Amit Gupta
// Date: 16-09-2026
// Program: Print cubes of first n numbers

public class cube_series {
    public static void main(String[] args) {
        
        int n = 5; 
        int choice = 1;
        
        switch(choice) {
            case 1:
                // Loop to print cubes
                for(int i = 1; i <= n; i++) {
                    System.out.println("Cube of " + i + " => " + (i * i * i));
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

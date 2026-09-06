// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find average of first n numbers

public class average_of_numbers {
    public static void main(String[] args) {
        
        int n = 5; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0;
                // Loop to add numbers
                for(int i = 1; i <= n; i++) {
                    sum += i;
                }
                // Calculate average
                double avg = (double) sum / n;
                System.out.println("Average => " + avg);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

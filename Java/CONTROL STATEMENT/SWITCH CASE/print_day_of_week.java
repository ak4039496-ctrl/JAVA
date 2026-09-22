// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print day of week 

public class print_day_of_week {
    public static void main(String[] args) {
        
        // Predefined day number
        int day = 3; // Example: 3 means Wednesday
        
        // Switch-case to print day name
        switch(day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number!");
        }
    }
}

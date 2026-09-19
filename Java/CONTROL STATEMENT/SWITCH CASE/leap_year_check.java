// Author: Amit Gupta
// Date: 18-09-2026
// Program: Check if year is Leap Year

public class leap_year_check {
    public static void main(String[] args) {
        
        int year = 2024;
        int choice = 1;
        
        switch(choice) {
            
            case 1:
                // Leap year condition
                if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " is Leap Year");
                } else {
                    System.out.println(year + " is Not Leap Year");
                }
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
    }
}

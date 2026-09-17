// Author: Amit Gupta
// Date: 16-09-2026
// Program: Work type based on day number

public class day_number_to_work {
    public static void main(String[] args) {
        
        int day = 1; 
        
        switch(day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Office Work"); break;
            case 6: case 7:
                System.out.println("Holiday"); break;
            default:
                System.out.println("Invalid day!");
        }
    }
}

// Author: Amit Gupta
// Date: 20-09-2026
// Program: Activity based on weekday

public class weekday_activity {
    public static void main(String[] args) {
        
        int day = 7; // Example: Sunday
        
        switch(day) {
            case 1: System.out.println("Go to Office"); break;
            case 2: System.out.println("Attend Meeting"); break;
            case 3: System.out.println("Project Work"); break;
            case 4: System.out.println("Team Discussion"); break;
            case 5: System.out.println("Submit Report"); break;
            case 6: System.out.println("Shopping"); break;
            case 7: System.out.println("Relax at Home"); break;
            default: System.out.println("Invalid day!");
        }
    }
}

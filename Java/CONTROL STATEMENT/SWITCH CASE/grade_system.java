// Author: Amit Gupta
// Date: 16-09-2026
// Program: Display grade based on marks

public class grade_system {
    public static void main(String[] args) {
        
        int marks = 82; // Example marks
        
        switch(marks / 10) {
            case 10:
            case 9: System.out.println("Grade: A"); break;
            case 8: System.out.println("Grade: B"); break;
            case 7: System.out.println("Grade: C"); break;
            case 6: System.out.println("Grade: D"); break;
            default: System.out.println("Grade: F"); break;
        }
    }
}

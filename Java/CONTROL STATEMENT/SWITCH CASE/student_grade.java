// Author: Amit Gupta
// Date: 20-09-2026
// Program: Student grade based on percentage

public class student_grade {
    public static void main(String[] args) {
        
        int percentage = 72;
        
        switch(percentage / 10) {
            case 10: case 9: System.out.println("Excellent"); break;
            case 8: System.out.println("Very Good"); break;
            case 7: System.out.println("Good"); break;
            case 6: System.out.println("Average"); break;
            default: System.out.println("Poor"); break;
        }
    }
}

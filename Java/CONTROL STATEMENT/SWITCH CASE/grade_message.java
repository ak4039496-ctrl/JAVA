// Author: Amit Gupta
// Date: 17-09-2026
// Program: Grade message

public class grade_message {
    public static void main(String[] args) {
        
        int marks = 55;
        
        switch(marks / 10) {
            case 10: case 9: System.out.println("Excellent"); break;
            case 8: System.out.println("Very Good"); break;
            case 7: System.out.println("Good"); break;
            case 6: System.out.println("Average"); break;
            default: System.out.println("Poor"); break;
        }
    }
}

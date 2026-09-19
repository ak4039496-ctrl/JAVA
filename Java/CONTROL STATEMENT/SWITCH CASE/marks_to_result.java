// Author: Amit Gupta
// Date: 06-09-2026
// Program: Pass/Fail based on marks

public class marks_to_result {
    public static void main(String[] args) {
        
        int marks = 45;
        
        switch(marks >= 40 ? 1 : 0) {
            case 1: System.out.println("Pass"); break;
            case 0: System.out.println("Fail"); break;
        }
    }
}

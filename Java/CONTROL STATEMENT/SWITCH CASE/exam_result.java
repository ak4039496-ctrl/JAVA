// Author: Amit Gupta
// Date: 17-09-2026
// Program: Exam result

public class exam_result {
    public static void main(String[] args) {
        
        int marks = 90;
        
        switch(marks >= 50 ? 1 : 0) {
            case 1: System.out.println("Pass"); break;
            case 0: System.out.println("Fail"); break;
        }
    }
}

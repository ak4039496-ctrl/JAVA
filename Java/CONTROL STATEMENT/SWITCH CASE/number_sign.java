// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check sign of number

public class number_sign {
    public static void main(String[] args) {
        
        int num = -8;
        
        switch(num > 0 ? 1 : (num < 0 ? -1 : 0)) {
            case 1: System.out.println("Positive"); break;
            case -1: System.out.println("Negative"); break;
            case 0: System.out.println("Zero"); break;
        }
    }
}

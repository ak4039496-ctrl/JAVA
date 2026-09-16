// Author: Amit Gupta
// Date: 16-09-2026
// Program: Check even or odd using switch-case

public class check_even_odd {
    public static void main(String[] args) {
        
        int num = 15; 
        
        switch(num % 2) {
            case 0: System.out.println("Even number"); break;
            case 1: System.out.println("Odd number"); break;
        }
    }
}

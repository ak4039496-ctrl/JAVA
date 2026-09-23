// Author: Amit Gupta
// Date: 20-09-2026
// Program: Simple calculator using switch-case

public class simple_calculator {
    public static void main(String[] args) {
        
        int a = 20;  // First number
        int b = 5;   // Second number
        char op = '*'; // Operation chosen
        
        switch(op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println("Result: " + (a / b)); break;
            default: System.out.println("Invalid operator!");
        }
    }
}

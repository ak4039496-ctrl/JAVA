/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate logical OR operator (||)
*/
public class LogicalOrOperator {
    public static void main(String[] args) {
        int a = -5, b = 10;
        if (a > 0 || b > 0)
            System.out.println("At least one number is positive");
        else
            System.out.println("Both numbers are non-positive");
    }
}

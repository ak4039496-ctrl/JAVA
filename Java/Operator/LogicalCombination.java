/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate combination of logical operators
*/
public class LogicalCombination {
    public static void main(String[] args) {
        int x = 5, y = -3;
        if ((x > 0 && y < 0) || (x == 5))
            System.out.println("Condition True");
        else
            System.out.println("Condition False");
    }
}

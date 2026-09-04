/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate chained relational operators
*/
public class RelationalChain {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a < b && b < c)
            System.out.println("a < b < c is True");
        else
            System.out.println("Condition False");
    }
}

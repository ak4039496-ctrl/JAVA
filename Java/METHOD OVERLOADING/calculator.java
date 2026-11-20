/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Calculator Using Method Overloading
*/

public class calculator {

    static int calculate(int a,int b) {
        return a + b;
    }

    static int calculate(int a,int b,char op) {
        switch(op) {
            case '+':
                return a + b;
            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(calculate(10,20));
        System.out.println(calculate(10,20,'*'));
    }
}
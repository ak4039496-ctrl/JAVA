/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate instanceof operator
*/
public class InstanceofOperator {
    public static void main(String[] args) {
        String str = "Hello";
        if (str instanceof String)
            System.out.println("str is an instance of String");
        else
            System.out.println("Not a String");
    }
}

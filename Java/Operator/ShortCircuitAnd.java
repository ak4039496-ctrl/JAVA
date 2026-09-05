/*
Author: Amit Gupta
Date: 08-08-2026
Program: Demonstrate short-circuit AND (&&)
*/
public class ShortCircuitAnd {
    public static void main(String[] args) {
        int a = 5;
        if (a > 0 && (10 / a) > 1) {
            System.out.println("Condition True");
        }
    }
}

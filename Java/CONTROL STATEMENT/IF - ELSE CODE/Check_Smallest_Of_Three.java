/*
Author: Amit Gupta
Date: 26-Aug-2026
Program: Find the smallest of three numbers
*/

public class Check_Smallest_Of_Three {
    public static void main(String[] args) {
        int a = 15, b = 10, c = 20;

        // if-else ladder to find smallest
        if(a < b && a < c) {
            System.out.println("A is Smallest");
        } else if(b < c) {
            System.out.println("B is Smallest");
        } else {
            System.out.println("C is Smallest");
        }
    }
}

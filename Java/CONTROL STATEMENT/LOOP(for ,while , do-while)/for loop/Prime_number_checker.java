/*
Author: Amit Gupta
Date: 05-09-2026
Program: Prime Number Checker
*/

public class Prime_number_checker {
    public static void main(String[] args) {
        int num = 29;
        boolean prime = true;

        for(int i=2;i<=num/2; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime) System.out.println(num + " is Prime");
        else System.out.println(num + " is Not Prime");
    }
}

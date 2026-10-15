/*
Author: Amit Gupta
Date: 05-09-2026
Program: Check if a number is Palindrome
*/

public class Palindrome_number_check {
    public static void main(String[] args) {
        int num = 1221;
        int rev = 0, temp = num;

        for(; temp > 0; temp /= 10) {
            rev = rev * 10 + (temp % 10);
        }

        if(rev == num) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is Not Palindrome");
        }
    }
}

/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Palindrome Check Using Method Overloading
*/

public class palindrome_str {

    static boolean check(String str) {

        String rev =new StringBuilder(str).reverse().toString();

        return str.equalsIgnoreCase(rev);
    }

    static boolean check(int num) {

        int original = num;
        int rev = 0;

        while(num > 0) {

            rev =rev * 10 + num % 10;
            num /= 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {

        System.out.println(check("madam"));

        System.out.println(check(121));
    }
}
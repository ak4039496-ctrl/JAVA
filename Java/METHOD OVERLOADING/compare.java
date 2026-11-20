/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Compare Different Values
*/

public class compare {

    static boolean compare(int a,int b) {
        return a == b;
    }

    static boolean compare(String a,String b) {

        return a.equals(b);
    }
    static boolean compare(char a,char b) {
        return a == b;
    }

    public static void main(String[] args) {

        System.out.println( compare(10, 10));

        System.out.println(compare("Java", "Java"));
        System.out.println(compare('A', 'A'));
    }
}
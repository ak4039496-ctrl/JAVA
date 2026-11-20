/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: String Concatenation Using Overloading
*/

public class concat {

    static String join(String a,String b) {
        return a + b;
    }
    static String join(String a,String b,String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(join("Hello ","World"));
        System.out.println(join("Java ","Method ","Overloading"));
    }
}
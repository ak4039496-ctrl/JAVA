/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Toggle Case Using Method Overloading
*/

public class toggle {

    static char toggle(char ch) {

        if(Character.isUpperCase(ch))
            return Character.toLowerCase(ch);

        return Character.toUpperCase(ch);
    }

    static String toggle(String str) {

        String result = "";

        for(int i=0;i<str.length();i++) {

            result += toggle( str.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(toggle('A'));

        System.out.println(toggle("Java"));
    }
}
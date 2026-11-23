/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Replace Character or Word Using Overloading
*/

public class replace {

    // Replace character
    static String change(String str,char oldChar,char newChar) {

        return str.replace(oldChar,newChar);
    }

    // Replace word
    static String change(String str,String oldWord, String newWord) {

        return str.replace(oldWord,newWord);
    }

    public static void main(String[] args) {

        System.out.println(change("java",'a','o'));

        System.out.println(change("I Love Java","Java","Programming"));
    }
}
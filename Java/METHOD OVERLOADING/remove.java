/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Remove Character or Word
*/

public class remove {

    static String removeData(String str,char ch) {

        return str.replace(String.valueOf(ch),"");
    }

    static String removeData(String str,String word) {

        return str.replace(word,"");
    }

    public static void main(String[] args) {

        System.out.println(removeData("Java", 'a'));

        System.out.println(removeData("I Love Java","Love "));
    }
}
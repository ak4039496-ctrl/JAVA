/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Search Using Method Overloading
*/

public class search {

    static boolean search(String str,char ch) {

        return str.indexOf(ch) >= 0;
    }

    static boolean search(String str,String word) {

        return str.contains(word);
    }

    public static void main(String[] args) {

        System.out.println(search("Java", 'v'));

        System.out.println(search("Java Programming","Programming"));
    }
}
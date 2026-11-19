/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Anagram Check Using Method Overloading
*/

import java.util.Arrays;

public class anagram {

    static boolean check(String a,String b) {

        char[] x =a.toLowerCase().toCharArray();
        char[] y =b.toLowerCase().toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }

    static boolean check(String[] words) {
        return check(words[0],words[1]);
    }
    public static void main(String[] args) {

        String[] arr = {"listen","silent"};

        System.out.println(check("heart","earth"));
        System.out.println(check(arr));
    }
}
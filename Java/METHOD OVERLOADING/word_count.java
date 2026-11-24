/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Words Using Method Overloading
*/

public class word_count {

    static int count(String sentence) {

        return sentence.trim().split("\\s+").length;
    }

    static int count(String[] words) {

        return words.length;
    }

    public static void main(String[] args) {

        String[] arr = {"Java","Python","C++"};

        System.out.println(count("I Love Java"));

        System.out.println( count(arr));
    }
}
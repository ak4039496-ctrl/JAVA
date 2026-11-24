/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Vowels
*/

public class vowel {

    static int countVowel(String str) {

        int count = 0;

        str = str.toLowerCase();

        for(int i = 0;i < str.length();i++) {

            char ch =str.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||
               ch=='u') {

                count++;
            }
        }

        return count;
    }

    static int countVowel(char[] arr) {

        int count = 0;

        for(char ch : arr) {

            ch =Character.toLowerCase(ch);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        char[] letters = {'A','B','E','I'};

        System.out.println(countVowel("Programming"));

        System.out.println(countVowel(letters));
    }
}
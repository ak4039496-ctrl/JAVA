/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Compress Data Using Method Overloading
 */

public class compress {

    static String compress(String str) {

        String result = "";
        int count = 1;

        for (int i = 0;i < str.length();i++) {
            while (i < str.length() - 1 && str.charAt(i)== str.charAt(i + 1)) {
                count++;
                i++;
            }

            result+= str.charAt(i);
            result += count;
            count = 1;
        }

        return result;
    }

    static String compress(char[] arr) {

        return compress(new String(arr));
    }

    public static void main(String[] args) {

        System.out.println(compress("aaabbcc"));
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b'}));
    }
}

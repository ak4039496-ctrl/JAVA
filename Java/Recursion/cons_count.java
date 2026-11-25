/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Consonants Using Recursion
*/

public class cons_count {

    static int countConsonants(String str,int index) {

        // Base case
        if(index == str.length()) {
            return 0;
        }

        char ch =Character.toLowerCase(str.charAt(index));

        int count = 0;

        if(ch >= 'a' &&ch <= 'z' &&ch != 'a' &&ch != 'e' &&ch != 'i' &&ch != 'o' &&
           ch != 'u') {

            count = 1;
        }

        return count +countConsonants(str,index + 1);
    }

    public static void main(String[] args) {

        String str = "Programming";

        System.out.println(countConsonants(str,0));
    }
}
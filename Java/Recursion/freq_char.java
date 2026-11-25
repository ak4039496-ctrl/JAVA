/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Character Frequency
*/

public class freq_char {

    // Recursive method
    static int frequency(String str,char target,int index) {

        // Base case
        if (index == str.length()) {
            return 0;
        }

        int count = 0;

        if (str.charAt(index) == target) {
            count = 1;
        }

        return count +frequency( str,target,index + 1);
    }

    public static void main(String[] args) {

        String str = "programmmming";

        System.out.println(frequency(str,'m',0));
    }
}
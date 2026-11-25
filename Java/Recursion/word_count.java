/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Words Using Recursion
*/

public class word_count {

    // Recursive method
    static int countWords(String str,int index) {

        // Base case
        if (index >= str.length()) {
            return 1;
        }

        if (str.charAt(index) == ' ') {

            return 1 +countWords(str,index + 1);
        }

        return countWords(str,index + 1);
    }

    public static void main(String[] args) {

        String str ="I Love Java Programming";

        System.out.println("Words = "+ countWords(str, 0));
    }
}
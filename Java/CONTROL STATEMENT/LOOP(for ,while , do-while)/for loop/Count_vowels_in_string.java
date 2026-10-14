/*
Author: Amit Gupta
Date: 05-09-2026
Program: Count vowels in a string
*/

public class Count_vowels_in_string {
    public static void main(String[] args) {
        String str = "Programming";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
                count++;
            }
        }

        System.out.println("Total vowels => " + count);
    }
}

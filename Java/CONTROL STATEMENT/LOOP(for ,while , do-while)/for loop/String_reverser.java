/*
Author: Amit Gupta
Date: 05-09-2026
Program: String Reverser
*/

public class String_reverser {
    public static void main(String[] args) {
        String text = "Hello Amit";
        String reversed = "";

        for(int i = text.length()-1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}

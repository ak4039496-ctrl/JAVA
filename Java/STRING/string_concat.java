// Author: Amit Gupta
// Date: 09-09-2026
// Program: Concatenate two strings

public class string_concat {
    public static void main(String[] args) {
        //  Declare two strings
        String s1 = "Hello";
        String s2 = "World";

        //  Concatenate using concat()
        String result = s1.concat(" " + s2);

        //  Print result
        System.out.println("Concatenated string => " + result);
    }
}

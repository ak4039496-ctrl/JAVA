// Author: Amit Gupta
// Date: 09-09-2026
// Program: Sort characters in string

import java.util.Arrays;

public class string_sortCharacters {
    public static void main(String[] args) {
        // Declare string
        String text = "program";

        //  Convert to char array
        char[] arr = text.toCharArray();

        //  Sort array
        Arrays.sort(arr);

        //  Print result
        System.out.println("Sorted => " + new String(arr));
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove non-alphabet characters

public class string_removeNonAlphabet {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello123@World";

        //  Replace non-alphabet with empty string
        String result = text.replaceAll("[^a-zA-Z]", "");

        // Print result
        System.out.println("Only alphabets => " + result);
    }
}

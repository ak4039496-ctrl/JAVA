// Author: Amit Gupta
// Date: 29-09-2026
// Program: Remove numbers from string

public class string_removeNumbers {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello123World456";

        //  Replace digits with empty string
        String result = text.replaceAll("[0-9]", "");

        // Print result
        System.out.println("Without numbers => " + result);
    }
}

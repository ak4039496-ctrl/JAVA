// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove non-digit characters

public class string_removeNonDigits {
    public static void main(String[] args) {
        //Declare string
        String text = "Hello123World456";

        // Replace non-digits with empty string
        String result = text.replaceAll("[^0-9]", "");

        // Print result
        System.out.println("Only digits => " + result);
    }
}

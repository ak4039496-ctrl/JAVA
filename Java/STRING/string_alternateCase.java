// Author: Amit Gupta
// Date: 09-09-2026
// Program: Convert string to alternate case

public class string_alternateCase {
    public static void main(String[] args) {
        // Step 1: Declare string
        String text = "amit  kumar";

        // Step 2: Convert to alternate case
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (i % 2 == 0) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

        // Step 3: Print result
        System.out.println("Alternate case => " + result);
    }
}

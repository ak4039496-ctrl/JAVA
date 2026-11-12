// Author: Amit Gupta
// Date: 09-09-2026
// Program: Toggle case of characters

public class string_toggleCase {
    public static void main(String[] args) {
        // Declare string
        String text = "Hello World";

        //Toggle case
        String result = "";
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else {
                result += Character.toUpperCase(c);
            }
        }

        //  Print result
        System.out.println("Toggled => " + result);
    }
}

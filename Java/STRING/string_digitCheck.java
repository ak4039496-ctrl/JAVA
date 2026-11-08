// Author: Amit Gupta
// Date: 01-10-2026
// Program: Check if string contains digits

public class string_digitCheck {
    public static void main(String[] args) {
        //  Declare string
        String text = "Hello123";

        // Loop through characters
        boolean hasDigit = false;
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }

        //Print result
        System.out.println("Contains digit? " + hasDigit);
    }
}

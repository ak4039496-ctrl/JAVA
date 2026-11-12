// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check if string contains letters

public class string_letterCheck {
    public static void main(String[] args) {
        //  Declare string
        String text = "12345";

        // Loop through characters
        boolean hasLetter = false;
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }

        //  Print result
        System.out.println("Contains letter? " + hasLetter);
    }
}

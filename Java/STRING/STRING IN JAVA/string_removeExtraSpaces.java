// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove extra spaces between words

public class string_removeExtraSpaces {
    public static void main(String[] args) {
        // Declare string with extra spaces
        String text = "Java    is   powerful";

        // Replace multiple spaces with single space
        String result = text.replaceAll("\\s+", " ");

        // Print result
        System.out.println("Result = " + result);
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Replace digits with '*'

public class string_replaceDigitsWithStars {
    public static void main(String[] args) {
        // Declare string
        String text = "Hello123World";

        // Replace digits with '*'
        String result = text.replaceAll("[0-9]", "*");

        //Print result
        System.out.println("Replaced => " + result);
    }
}

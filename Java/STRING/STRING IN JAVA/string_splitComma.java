// Author: Amit Gupta
// Date: 09-09-2026
// Program: Split string by comma

public class string_splitComma {
    public static void main(String[] args) {
        //Declare string
        String text = "apple,banana,orange";

        // Split by comma
        String[] fruits = text.split(",");

        // Print each fruit
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}

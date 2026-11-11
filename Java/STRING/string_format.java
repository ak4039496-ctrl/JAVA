// Author: Amit Gupta
// Date: 09-09-2026
// Program: Format string using String.format()

public class string_format {
    public static void main(String[] args) {
        // Step 1: Declare variables
        String name = "Amit";
        int age = 25;

        // Step 2: Format string
        String result = String.format("My name is %s and I am %d years old.", name, age);

        // Step 3: Print result
        System.out.println(result);
    }
}

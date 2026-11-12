// Author: Amit Gupta
// Date: 09-09-2026
// Program: Generate username from name

public class string_usernameGenerator {
    public static void main(String[] args) {
        // Declare full name
        String name = "Amit Gupta";

        // Split into words
        String[] parts = name.split(" ");

        // Create username (first letter + last name)
        String username = parts[0].charAt(0) + parts[1];

        // Print result
        System.out.println("Username => " + username.toLowerCase());
    }
}

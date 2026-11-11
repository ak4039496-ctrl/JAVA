// Author: Amit Gupta
// Date: 09-09-2026
// Program: Extract initials from name

public class string_initials {
    public static void main(String[] args) {
        // Declare full name
        String name = "Amit kumar Gupta";

        //  Split into words
        String[] parts = name.split(" ");

        // Print initials
        String initials = "";
        for (String p : parts) {
            initials += p.charAt(0);
        }

        // Print result
        System.out.println("Initials => " + initials.toUpperCase());
    }
}

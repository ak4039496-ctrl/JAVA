// Author: Amit Gupta
// Date: 09-09-2026
// Program: Remove duplicate characters

public class string_removeDuplicateChars {
    public static void main(String[] args) {
        // Declare string
        String text = "programming";

        //  Use StringBuilder for unique chars
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) { // char nhi str esi liye (String.valueOf(c))
                sb.append(c);
            }
        }

        //  Print result
        System.out.println("Without duplicates => " + sb);
    }
}

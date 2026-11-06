// Author: Amit Gupta
// Date: 09-09-2026
// Program: Insert text using StringBuilder

public class string_builderInsert {
    public static void main(String[] args) {
        //  Create StringBuilder
        StringBuilder sb = new StringBuilder("HelloWorld");

        //  Insert space at index 5
        sb.insert(5, " ");

        // Print result
        System.out.println("Inserted =>" + sb.toString());
    }
}

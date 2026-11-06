// Author: Amit Gupta
// Date: 09-09-2026
// Program: Append text using StringBuilder

public class string_builderAppend {
    public static void main(String[] args) {
        //  Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        //  Append text
        sb.append(" World");

        //  Print result
        System.out.println("Appended => " + sb.toString());
    }
}

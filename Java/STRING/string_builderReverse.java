// Author: Amit Gupta
// Date: 09-09-2026
// Program: Reverse string using StringBuilder

public class string_builderReverse {
    public static void main(String[] args) {
        //  Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        //  Reverse string
        sb.reverse();

        //  Print result
        System.out.println("Reversed => " + sb.toString());
    }
}

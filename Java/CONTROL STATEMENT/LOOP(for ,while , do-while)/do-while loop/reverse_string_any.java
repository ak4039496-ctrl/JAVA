// Author: Amit Gupta
// Date: 06-09-2026
// Program: Reverse any string (example: HELLO)

public class reverse_string_any {
    public static void main(String[] args) {
        String str = "HELLO";
        int i = str.length() - 1;
        String rev = "";
        do {
            rev += str.charAt(i);
            i--;
        } while (i >= 0);
        System.out.println("Reversed => " + rev);
    }
}

// Author: Amit Gupta
// Date: 05-09-2026
// Program: Reverse a string 

public class print_reverse_string {
    public static void main(String[] args) {
        String str = "PROGRAM"; // string to reverse
        int i = str.length() - 1; // start from last index

        while (i >= 0) {
            System.out.print(str.charAt(i)); // print character
            i--; // move backward
        }
    }
}

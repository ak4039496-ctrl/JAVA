// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if string "LEVEL" is palindrome using while loop

public class check_palindrome_string {
    public static void main(String[] args) {
        String str = "LEVEL";
        int i = 0;
        int j = str.length() - 1;
        boolean isPal = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }

        if (isPal) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}

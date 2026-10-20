// Author: Amit Gupta
// Date: 25-09-2026
// Program: Check if binary of a number is palindrome using while loop

public class check_binary_palindrome {
    public static void main(String[] args) {
        int num = 9; // number to check
        String bin = Integer.toBinaryString(num); // binary string
        int i = 0;
        int j = bin.length() - 1;
        boolean isPal = true;

        while (i < j) {
            if (bin.charAt(i) != bin.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }

        if (isPal) {
            System.out.println("Binary of " + num + " is Palindrome");
        } else {
            System.out.println("Binary of " + num + " is Not Palindrome");
        }
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Check password length

public class string_passwordLength {
    public static void main(String[] args) {
        //  Declare password
        String password = "mypassword123";

        //  Check length >= 8
        if (password.length() >= 8) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}

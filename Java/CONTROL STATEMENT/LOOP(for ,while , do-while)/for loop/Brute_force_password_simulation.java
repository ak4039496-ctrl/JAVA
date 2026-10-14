/*
Author: Amit Gupta
Date: 05-09-2026
Program: Brute Force Password Simulation (safe demo)
*/

public class Brute_force_password_simulation {
    public static void main(String[] args) {
        String target = "123";
        String attempt = "";

        for(int i = 0; i <= 999; i++) {
            attempt = String.valueOf(i); // convert str
            if(attempt.equals(target)) {
                System.out.println("Password found: " + attempt);
                break;
            }
        }
    }
}

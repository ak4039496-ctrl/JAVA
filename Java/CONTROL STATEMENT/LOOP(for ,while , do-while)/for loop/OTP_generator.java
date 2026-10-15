/*
Author: Amit Gupta
Date: 05-09-2026
Program: One-Time Password (OTP) Generator
*/

import java.util.Random;

public class OTP_generator {
    public static void main(String[] args) {
        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000); // 6-digit OTP
        System.out.println("Generated OTP: " + otp);
    }
}

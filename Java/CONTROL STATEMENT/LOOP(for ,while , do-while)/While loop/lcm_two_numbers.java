// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find LCM of two numbers 
public class lcm_two_numbers {
    public static void main(String[] args) {
        int a = 12; // first number
        int b = 15; // second number
        int lcm = (a > b) ? a : b; // start with larger number

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM => " + lcm);
                break; // found LCM
            }
            lcm++; // try next number
        }
    }
}

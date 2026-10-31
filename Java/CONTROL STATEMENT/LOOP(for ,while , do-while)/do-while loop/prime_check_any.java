// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is prime

public class prime_check_any {
    public static void main(String[] args) {
        int num = 37; //  Input number
        boolean prime = true; //  Assume prime
        int i = 2; //  Start divisor
        do {
            if (num % i == 0) { //  Check divisibility
                prime = false; //  Not prime
                break; //  Exit loop
            }
            i++; // Increment divisor
        } while (i <= num / 2); //  Condition check
        if (prime) System.out.println(num + " is Prime");
        else System.out.println(num + " is Not Prime");
    }
}

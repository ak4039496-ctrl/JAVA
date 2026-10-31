// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print prime numbers between 100–200

public class prime_check_range {
    public static void main(String[] args) {
        int num = 100;
        do {
            boolean prime = true;
            int i = 2;
            do {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            } while (i <= num / 2);
            if (prime) System.out.println(num);
            num++;
        } while (num <= 200);
    }
}

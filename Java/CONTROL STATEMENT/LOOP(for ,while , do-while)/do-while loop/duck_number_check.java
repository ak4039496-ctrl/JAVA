// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Duck (contains zero but not at start)

public class duck_number_check {
    public static void main(String[] args) {
        int num = 056; //  Input number
        int temp = num; //  Copy number
        boolean duck = false; //  Assume false
        do {
            int digit = temp % 10; // Extract digit
            if (digit == 0) { // Check zero
                duck = true; //  Found zero
                break;
            }
            temp /= 10; //  Remove digit
        } while (temp > 0); //  Condition check
        if (duck) {
            System.out.println(num + " is Duck");
        } else {
            System.out.println(num + " is Not Duck");
        }
    }
}

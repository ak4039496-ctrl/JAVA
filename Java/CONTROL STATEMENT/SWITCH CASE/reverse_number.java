// Author: Amit Gupta
// Date: 19-09-2026
// Program: Reverse a number 

public class reverse_number {
    public static void main(String[] args) {
        
        int num = 1234;
        int choice = 1; // 1 means reverse
        
        switch(choice) {
            case 1:
                int rev = 0;
                int temp = num;
                while(temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                System.out.println("Reverse of " + num + " => " + rev);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

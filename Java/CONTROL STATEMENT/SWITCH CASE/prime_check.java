// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check prime number

public class prime_check {
    public static void main(String[] args) {
        
        int num = 29;
        int choice = 1;
        
        switch(choice) {
            case 1:
                boolean prime = true;
                for(int i = 2; i <= num/2; i++) {
                    if(num % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if(prime)
                    System.out.println(num + " is Prime");
                else
                    System.out.println(num + " is Not Prime");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

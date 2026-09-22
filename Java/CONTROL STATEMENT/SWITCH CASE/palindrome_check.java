// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check palindrome number

public class palindrome_check {
    public static void main(String[] args) {
        
        int num = 121;
        int choice = 1;
        
        switch(choice) {
            case 1:
                int rev = 0, temp = num;
                while(temp > 0) {
                    rev = rev * 10 + temp % 10;
                    temp /= 10;
                }
                if(num == rev)
                    System.out.println(num + " is Palindrome");
                else
                    System.out.println(num + " is Not Palindrome");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

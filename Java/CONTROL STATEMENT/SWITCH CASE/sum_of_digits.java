// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of digits

public class sum_of_digits {
    public static void main(String[] args) {
        
        int num = 987;
        int choice = 1;
        
        switch(choice) {
            case 1:
                int sum = 0, temp = num;
                while(temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                System.out.println("Sum of digits = " + sum);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

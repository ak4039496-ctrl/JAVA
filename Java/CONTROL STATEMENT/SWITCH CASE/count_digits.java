// Author: Amit Gupta
// Date: 16-09-2026
// Program: Count digits in number

public class count_digits {
    public static void main(String[] args) {
        int num = 12345;
        int choice = 1;
        switch(choice) {
            case 1:
                int count = 0, temp = num;
                while(temp > 0) {
                    count++;
                    temp /= 10;
                }
                System.out.println("Digits count => " + count);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

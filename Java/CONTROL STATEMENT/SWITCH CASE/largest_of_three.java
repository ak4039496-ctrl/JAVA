// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find largest of three numbers

public class largest_of_three {
    public static void main(String[] args) {
        
        int a = 12, b = 25, c = 9;
        int choice = 1;
        
        switch(choice) {
            case 1:
                if(a >= b && a >= c)
                    System.out.println("Largest:- " + a);
                else if(b >= a && b >= c)
                    System.out.println("Largest:- " + b);
                else
                    System.out.println("Largest:- " + c);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}

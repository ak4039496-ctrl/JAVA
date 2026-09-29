// Author: Amit Gupta
// Date: 29-09-2026
// Program: Print even numbers up to 20 but stop at 12

public class even_numbers_break {
    public static void main(String[] args) {
        
        // loop from 2 to 20
        for (int i = 2; i <= 20; i++) {
            
            // check if number is even
            if (i % 2 == 0) {
                
                // if number is 12, stop loop
                if (i == 12) {
                    break;
                }
                
                // print even number
                System.out.println(i);
            }
        }
    }
}

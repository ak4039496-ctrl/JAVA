// Author: Amit Gupta
// Date: 29-09-2026
// Program: Print numbers 1 to 10 but stop at 5 using break

public class print_1_to_10_break {
    public static void main(String[] args) {
        
        // for loop starts from 1 and goes till 10
        for (int i = 1; i <= 10; i++) {
            
            // if i becomes 5, break will stop the loop
            if (i == 5) {
                break; // loop ends here
            }
            
            // print the current number
            System.out.println(i);
        }
    }
}

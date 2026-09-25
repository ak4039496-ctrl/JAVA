// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when a negative number is found

public class break_on_negative {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, -5, 40};
        
        // loop through array
        for (int i = 0; i < numbers.length; i++) {
            
            // if number is negative, stop loop
            if (numbers[i] < 0) {
                break;
            }
            
            // print number
            System.out.println(numbers[i]);
        }
    }
}

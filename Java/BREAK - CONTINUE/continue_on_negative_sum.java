// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip adding negative numbers

public class continue_on_negative_sum {
    public static void main(String[] args) {
        
        int[] numbers = {10, -5, 20, -15, 30};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                continue; // skip negative
            }
            sum += numbers[i];
        }
        System.out.println("Sum=> " + sum);
    }
}

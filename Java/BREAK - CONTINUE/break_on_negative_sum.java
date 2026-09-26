// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when sum becomes negative

public class break_on_negative_sum {
    public static void main(String[] args) {
        
        int[] numbers = {10, 5, -20, 15};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            
            if (sum < 0) {
                break; // stop loop
            }
            
            System.out.println("Sum => " + sum);
        }
    }
}

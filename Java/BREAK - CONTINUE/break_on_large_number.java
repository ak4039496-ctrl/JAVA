// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when number > 50

public class break_on_large_number {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 60, 40};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                break; // stop loop
            }
            System.out.println(numbers[i]);
        }
    }
}

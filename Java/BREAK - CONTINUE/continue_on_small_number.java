// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip numbers less than 10

public class continue_on_small_number {
    public static void main(String[] args) {
        
        int[] numbers = {5, 12, 3, 18, 25};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                continue; // skip small numbers
            }
            System.out.println(numbers[i]);
        }
    }
}

// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip zero values

public class continue_on_zero {
    public static void main(String[] args) {
        
        int[] numbers = {2, 0, 4, 0, 6};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue; // skip zero
            }
            System.out.println(numbers[i]);
        }
    }
}

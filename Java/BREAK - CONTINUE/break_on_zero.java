// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when zero is found

public class break_on_zero {
    public static void main(String[] args) {
        
        int[] numbers = {5, 3, 7, 0, 9};
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                break; // stop loop
            }
            System.out.println(numbers[i]);
        }
    }
}

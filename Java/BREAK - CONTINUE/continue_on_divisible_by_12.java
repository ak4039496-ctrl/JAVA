// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip numbers divisible by 12

public class continue_on_divisible_by_12 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) {
            if (i % 12 == 0) {
                continue; // skip multiples of 12
            }
            System.out.println(i);
        }
    }
}

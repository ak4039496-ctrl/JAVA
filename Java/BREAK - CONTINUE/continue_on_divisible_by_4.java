// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip numbers divisible by 4

public class continue_on_divisible_by_4 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                continue; // skip multiples of 4
            }
            System.out.println(i);
        }
    }
}

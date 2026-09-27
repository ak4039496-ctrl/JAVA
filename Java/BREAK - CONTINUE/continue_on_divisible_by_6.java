// Author: Amit Gupta
// Date: 19-09-2026
// Program: Skip numbers divisible by 6

public class continue_on_divisible_by_6 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 30; i++) {
            if (i % 6 == 0) {
                continue; // skip multiples of 6
            }
            System.out.println(i);
        }
    }
}

// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when number divisible by 11

public class break_on_divisible_by_11 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) {
            if (i % 11 == 0) {
                break; // stop loop
            }
            System.out.println(i);
        }
    }
}

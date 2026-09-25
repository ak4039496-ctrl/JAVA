// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when number divisible by 7

public class break_on_divisible_by_7 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                break; // stop loop
            }
            System.out.println(i);
        }
    }
}

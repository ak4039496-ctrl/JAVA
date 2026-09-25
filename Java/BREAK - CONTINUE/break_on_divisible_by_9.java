// Author: Amit Gupta
// Date: 19-09-2026
// Program: Stop loop when number divisible by 9

public class break_on_divisible_by_9 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 30; i++) {
            if (i % 9 == 0) {
                break; 
            }
            System.out.println(i);
        }
    }
}

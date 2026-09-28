// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip odd numbers

public class continue_on_odd {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                continue; // skip odd numbers
            }
            System.out.println(i);
        }
    }
}

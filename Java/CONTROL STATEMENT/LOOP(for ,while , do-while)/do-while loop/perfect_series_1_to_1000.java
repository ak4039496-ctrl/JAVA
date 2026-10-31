// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print all Perfect numbers between 1 and 1000

public class perfect_series_1_to_1000 {
    public static void main(String[] args) {
        int num = 1;
        do {
            int i = 1, sum = 0;
            do {
                if (num % i == 0) {
                    sum += i;
                }
                i++;
            } while (i < num);
            if (sum == num) {
                System.out.println(num);
            }
            num++;
        } while (num <= 1000);
    }
}

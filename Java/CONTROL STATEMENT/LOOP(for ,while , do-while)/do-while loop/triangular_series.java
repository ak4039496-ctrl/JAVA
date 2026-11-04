// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print first N triangular numbers

public class triangular_series {
    public static void main(String[] args) {
        int n = 10, i = 1;
        do {
            int triangular = i * (i + 1) / 2;
            System.out.print(triangular + " ");
            i++;
        } while (i <= n);
    }
}

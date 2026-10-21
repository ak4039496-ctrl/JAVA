// Author: Amit Gupta
// Date: 26-09-2026
// Program: Print first N cube numbers

public class cube_series {
    public static void main(String[] args) {
        int n = 10, i = 1;
        do {
            System.out.println(i * i * i + " ");
            i++;
        } while (i <= n);
    }
}

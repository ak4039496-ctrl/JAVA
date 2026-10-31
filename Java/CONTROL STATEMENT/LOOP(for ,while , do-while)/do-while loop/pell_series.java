// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print first N Pell numbers

public class pell_series {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, count = 1;
        do {
            System.out.print(a + " ");
            int next = 2 * b + a;
            a = b;
            b = next;
            count++;
        } while (count <= n);
    }
}

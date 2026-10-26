// Author: Amit Gupta
// Date: 25-09-2026
// Program: Find sum of factorials of numbers 1 to 5 

public class print_sum_of_factorials {
    public static void main(String[] args) {
        int n = 5; // limit
        int i = 1;
        int totalSum = 0;

        while (i <= n) {
            int fact = 1;
            int j = 1;

            while (j <= i) {
                fact *= j;
                j++;
            }

            totalSum += fact; // add factorial
            i++;
        }

        System.out.println("Sum of factorials => " + totalSum);
    }
}

// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print palindrome numbers from array

public class palindrome_array_elements {
    public static void main(String[] args) {
        int arr[] = {121, 123, 454, 789};
        int i = 0;
        do {
            int num = arr[i], temp = num, rev = 0;
            do {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            } while (temp > 0);
            if (rev == num) {
                System.out.println(num);
            }
            i++;
        } while (i < arr.length);
    }
}
